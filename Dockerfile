FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY build.gradle* settings.gradle* ./
COPY gradle ./gradle
COPY gradlew ./
RUN chmod +x gradlew
COPY src ./src
# Lint e testes rodam no CI; a imagem so precisa do jar
RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]