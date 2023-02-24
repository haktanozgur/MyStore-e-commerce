package com.haktanozgur.MyStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haktanozgur.MyStore.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional <User> findByEmail(String email);
	Optional<User>  findByPassword(String password);

}
