package com.example.javaapi2.repositories;

import com.example.javaapi2.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
