package com.scm.repsitories;
import com.scm.entities.User;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // extra methods db relatedoperations
    // custom query methods
    // custom finder methods

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmailToken(String id);

} 