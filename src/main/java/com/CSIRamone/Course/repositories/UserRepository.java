package com.CSIRamone.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CSIRamone.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
