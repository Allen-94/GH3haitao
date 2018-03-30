package com.GH3haitao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GH3haitao.module.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
