package org.brinka.brinkaapi.entrypoint.mapper;

import java.util.List;
import org.brinka.brinkaapi.application.dto.input.AddProductUseCaseInput;
import org.brinka.brinkaapi.application.dto.input.AddressInput;
import org.brinka.brinkaapi.application.dto.input.CardInput;
import org.brinka.brinkaapi.application.dto.input.SignUpUseCaseInput;
import org.brinka.brinkaapi.application.dto.input.UpdateProductUseCaseInput;
import org.brinka.brinkaapi.application.dto.input.UserProfileInput;
import org.brinka.brinkaapi.entrypoint.dto.request.AddCardRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.PatchProductRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.ProductRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.SignUpRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.UpdateAddressRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.UpdateCardRequest;
import org.brinka.brinkaapi.entrypoint.dto.request.UpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RequestMapper {
  // Card Requests
  CardInput toInput(UpdateCardRequest request);

  CardInput toInput(AddCardRequest request);

  // Update Requests
  @Mapping(target = "id", source = "id")
  UpdateProductUseCaseInput toInput(Integer id, PatchProductRequest request);

  AddProductUseCaseInput toInput(ProductRequest request);

  List<AddProductUseCaseInput> toInputList(List<ProductRequest> requests);

  // SignUp Requests
  SignUpUseCaseInput toInput(SignUpRequest request);

  // Address Requests
  AddressInput toInput(UpdateAddressRequest request);

  // User Requests
  UserProfileInput toInput(UpdateUserRequest request);
}
