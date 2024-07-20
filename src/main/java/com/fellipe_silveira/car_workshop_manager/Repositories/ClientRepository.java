package com.fellipe_silveira.car_workshop_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipe_silveira.car_workshop_manager.models.Client;

public interface ClientRepository extends JpaRepository<Client, String>{

}
