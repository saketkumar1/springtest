package com.springrest.springtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springtest.entities.User;

public interface userRepository extends JpaRepository<User, Long> {

}
