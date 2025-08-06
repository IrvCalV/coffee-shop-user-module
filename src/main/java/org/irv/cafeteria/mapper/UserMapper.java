package org.irv.cafeteria.mapper;

import org.irv.cafeteria.dto.UserRequestDTO;
import org.irv.cafeteria.dto.UserResponseDTO;
import org.irv.cafeteria.model.User;
//import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
public interface UserMapper {
    User requestDTOToUser(UserRequestDTO dto);
    UserRequestDTO userToRequestDTO(User dto);
    UserResponseDTO userToResponseDTO(User dto);
}
