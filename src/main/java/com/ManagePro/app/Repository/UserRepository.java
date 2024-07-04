package com.ManagePro.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManagePro.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
