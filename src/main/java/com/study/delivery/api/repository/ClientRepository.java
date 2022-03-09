package com.study.delivery.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.delivery.api.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	List <Client> findByNameContaining(String name);
}
