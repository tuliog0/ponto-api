package com.api.ponto.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.ponto.model.Client;
import com.api.ponto.repository.ClientRepository;

@Component
public class DummyData {
	
	@Autowired
	ClientRepository clientRepository;
	
	//@PostConstruct //Gerar Registros
	public void saveCatorios() {
		
		List<Client> clientList = new ArrayList<>();
		
		Client client1 = new Client();
		client1.setCompany_name("Client1");
		client1.setFantasy_name("Client1");
		
		Client client2 = new Client();
		client2.setCompany_name("Client2");
		client2.setFantasy_name("Client2");
		
		clientList.add(client1);
		clientList.add(client2);
		
		for(Client client: clientList) {
			Client clientSaved = clientRepository.save(client);
			System.out.println(clientSaved.getCompany_name());
		}
		
	}
}
