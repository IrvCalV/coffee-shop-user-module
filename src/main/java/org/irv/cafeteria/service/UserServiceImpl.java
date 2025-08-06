package org.irv.cafeteria.service;

import lombok.RequiredArgsConstructor;
import org.irv.cafeteria.dto.UserRequestDTO;
import org.irv.cafeteria.dto.UserResponseDTO;
import org.irv.cafeteria.mapper.UserMapper;
import org.irv.cafeteria.model.User;
import org.irv.cafeteria.repository.UserRepository;
import org.irv.cafeteria.util.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
//    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestUser) {
        if(isUserAlreadyRegistered(requestUser)){
            System.out.println();//User Already Registered
            throw new RuntimeException("Usuario ya registrado");
        }
//        User newUser = userMapper.requestDTOToUser(requestUser);
//        newUser.setActive(true);
//        newUser.setCreatedTimestamp(LocalDateTime.now());
//        newUser.setPassword(passwordEncoder.encode(newUser.getPassword())); //take a look at this
//
//        User savedUser = userRepository.save(newUser);
//        UserResponseDTO response = userMapper.userToResponseDTO(savedUser);
//        kafkaTemplate.send("usuario-creado", response); // Puedes personalizar el topic y contenido
//        return response;
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<List<User>> getUsersById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> getUsersByMail(String mail) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> getUsersByRol(Rol rol) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> getUsersByName(String name) {
        return Optional.empty();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser() {
    }

    private boolean isUserAlreadyRegistered(UserRequestDTO requestUser) {
        return userRepository.existsByMail(requestUser.getMail()) || userRepository.existsByUsername(requestUser.getUsername());
    }
}
