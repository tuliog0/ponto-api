package com.api.ponto.service.impl;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.ponto.model.Client;
import com.api.ponto.repository.ClientRepository;
import com.api.ponto.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> findAllClients() {
		return clientRepository.findAll(Sort.by("id"));
	}
	
	@Override
	public Client getClientById(int id) {
		return clientRepository.findById(id).get() ;
	}
	
	@Override
	public void saveClient(Client client) {
		clientRepository.save(client);
	}
	
//------------------------------------
	//@Transactional
	@Override
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	@Transactional
	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		
	}

}
