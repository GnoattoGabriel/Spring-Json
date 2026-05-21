package com.example.demo.services;

import com.example.demo.models.ClienteModel;
import com.example.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listarCliente(){
        return clienteRepository.findAll();
    }

    public ClienteModel save(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }
}
