package com.fellipe_silveira.car_workshop_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fellipe_silveira.car_workshop_manager.models.Client;
import com.fellipe_silveira.car_workshop_manager.services.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(value = "/clients")
	public String getClientMainPage(Model model) {
		return "client-registration";
	}

    @GetMapping(value = "clients/client-registration")
    public String getClientRegistration(Model model) {
        return "client-registration";
    }
    
    @PostMapping(value = "clients/client-registration")
    public void postClientRegistration(Client client) {
    	clientService.saveClient(client);
    }
    @GetMapping(value = "clients/manage-client")
    public String getManageClient(Model model) {
    	return "manage-client";
    }
    @PostMapping(value = "clients/manage-client")
    public String searchClient(@RequestParam("cpf") String cpf, Model model) {
    	Client client = clientService.findById(cpf);
    	model.addAttribute("client", client);
    	model.addAttribute("cpfBuscado", cpf);
    	return "manage-client";
    }
}
