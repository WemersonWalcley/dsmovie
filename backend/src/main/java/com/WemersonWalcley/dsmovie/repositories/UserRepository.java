package com.WemersonWalcley.dsmovie.repositories;

import com.WemersonWalcley.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
