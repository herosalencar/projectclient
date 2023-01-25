package com.example.projectclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {}
