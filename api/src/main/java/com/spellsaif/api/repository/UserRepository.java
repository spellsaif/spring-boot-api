package com.spellsaif.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spellsaif.api.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
