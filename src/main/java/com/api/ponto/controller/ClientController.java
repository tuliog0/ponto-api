package com.api.ponto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.api.ponto.service.ClientService;

import com.api.ponto.model.Client;

@Controller
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@ResponseBody
	@RequestMapping(value = "/clients/list", method = RequestMethod.GET)
	public List<Client> getClients(){	
		List<Client> clients = clientService.findAllClients();
		return clients;
	}
	
	@ResponseBody
	@RequestMapping(value = "/client/{id}", method=RequestMethod.GET)
	public Client getClientById(@PathVariable("id") int id) {
		Client client = clientService.getClientById(id);
	    return client;
	}
	
	@ResponseBody
	@RequestMapping(value="/client/new", method=RequestMethod.POST, produces = { "application/json;charset=UTF-8" }, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Client saveClient(@RequestBody Client client, BindingResult result, RedirectAttributes attributes){
		clientService.saveClient(client);
        return client;
    }

//	@RequestMapping(value="/client/update/{id}", method=RequestMethod.POST)
//	public String updateClient(@PathVariable("id") long id, @Valid Client client, BindingResult result/*, Model model*/) {
//	    if (result.hasErrors()) {
//	    	client.setId(id);
//	        return "client-edit";
//	    }
//	         
//	    clientService.save(client);
//	    return "redirect:/clients";
//	}

}
