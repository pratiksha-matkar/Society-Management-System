package com.society.societymanagement.repository;

import com.society.societymanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlatRepository extends JpaRepository<User, Long> {
}