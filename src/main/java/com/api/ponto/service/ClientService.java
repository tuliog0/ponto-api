package com.api.ponto.service;

import java.util.List;

import javax.validation.Valid;

import com.api.ponto.model.Client;

public interface ClientService {

	public List<Client> findAllClients();
	
	Client getClientById(int id);
	
	void saveClient(Client client);
	
//---------------------------------------
	List<Client> getClients();	
	
	void deleteClient(int id);
}
