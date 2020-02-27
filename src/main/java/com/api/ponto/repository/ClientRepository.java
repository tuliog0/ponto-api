package com.api.ponto.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ponto.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{	

}
