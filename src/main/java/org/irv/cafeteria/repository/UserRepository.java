package org.irv.cafeteria.repository;

import org.irv.cafeteria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByRol(String rol);

//    List<User> findByNombreCompletoContainingIgnoreCase(String nombre);
    List<User> findByActiveTrue();
    boolean existsByMail(String email);
    boolean existsByUsername(String userName);
}
