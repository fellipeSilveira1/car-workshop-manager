package com.fellipe_silveira.car_workshop_manager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellipe_silveira.car_workshop_manager.models.Client;
import com.fellipe_silveira.car_workshop_manager.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	//cadastra um novo cliente
	public void saveClient(Client client) {
		//Procura no banco de dados um cliente com o mesmo CPF do cliente registrar, se não existir, registra o novo cliente
		Optional<Client> checkClient = clientRepository.findById(client.getCpf());
		if (!checkClient.isPresent()) {
			clientRepository.save(client);
		}
	}
	//retorna uma lista contendo todos os clientes
	public List<Client> findAll() {
		List<Client> list = clientRepository.findAll();
		return list;
	}
	//procura um cliente pelo CPF
	public Client findById(String cpf) {
		Optional<Client> client = clientRepository.findById(cpf);
		return client.get();
	}
	
	
	
}
