package com.nacoss.tutorial.model.persistence.repositories;

import com.nacoss.tutorial.model.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
//    Optional<User> findById(Long id);
}
