package org.irv.cafeteria.service;

import org.irv.cafeteria.dto.UserRequestDTO;
import org.irv.cafeteria.dto.UserResponseDTO;
import org.irv.cafeteria.model.User;
import org.irv.cafeteria.util.Rol;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public UserResponseDTO createUser(UserRequestDTO user);
    public List<User> getAllUsers();
    public Optional<List<User>> getUsersById(Long id);
    public Optional<List<User>> getUsersByMail(String mail);
    public Optional<List<User>> getUsersByRol(Rol rol);
    public Optional<List<User>> getUsersByName(String name);
    public User updateUser(User user);
    public void deleteUser();

}

