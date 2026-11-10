package org.brinka.brinkaapi.infra.config;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.env.Environment;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Loads the schema and seed data from the brinka-database repository when the
 * database has no tables. It runs as soon as the DataSource is created, before
 * Hibernate validates the schema.
 */
@RequiredArgsConstructor
public class DatabaseBootstrapPostProcessor implements BeanPostProcessor {

    private static final Logger log =
            LoggerFactory.getLogger(DatabaseBootstrapPostProcessor.class);

    private static final String HAS_TABLES_QUERY = """
            SELECT 1
            FROM information_schema.tables
            WHERE table_schema = current_schema()
              AND table_type = 'BASE TABLE'
            LIMIT 1
            """;

    private final Environment environment;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof DataSource dataSource && isEnabled()) {
            bootstrap(dataSource);
        }

        return bean;
    }

    private boolean isEnabled() {
        return environment.getRequiredProperty("app.db-bootstrap.enabled", Boolean.class);
    }

    private void bootstrap(DataSource dataSource) {
        String schemaUrl = environment.getRequiredProperty("app.db-bootstrap.schema-url");
        String dataUrl = environment.getRequiredProperty("app.db-bootstrap.data-url");
        boolean loadData = environment.getRequiredProperty("app.db-bootstrap.load-data", Boolean.class);

        try (Connection connection = dataSource.getConnection()) {
            if (hasTables(connection)) {
                return;
            }

            log.warn("Database is empty, loading schema from {}", schemaUrl);
            executeScript(connection, schemaUrl);

            if (loadData) {
                log.warn("Loading seed data from {}", dataUrl);
                executeScript(connection, dataUrl);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Database bootstrap failed", e);
        }
    }

    private boolean hasTables(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(HAS_TABLES_QUERY)) {
            return resultSet.next();
        }
    }

    private void executeScript(Connection connection, String url) {
        ScriptUtils.executeSqlScript(
                connection,
                new EncodedResource(UrlResource.from(URI.create(url)), StandardCharsets.UTF_8)
        );
    }
}
