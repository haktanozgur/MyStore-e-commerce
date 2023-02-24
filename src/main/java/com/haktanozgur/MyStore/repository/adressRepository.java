package com.haktanozgur.MyStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haktanozgur.MyStore.entity.UserAdress;

public interface adressRepository extends JpaRepository<UserAdress, Integer> {

}
