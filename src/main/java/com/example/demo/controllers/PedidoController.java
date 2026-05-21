package com.example.demo.controllers;

import com.example.demo.models.ClienteModel;
import com.example.demo.models.ProdutoModel;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {
    @Autowired
    private ClienteService clienteService;

    public List<ClienteModel> listarCliente(){
        return clienteService.listarCliente();
    }

    public ClienteModel save(@RequestBody ClienteModel cliente){
        return clienteService.save(cliente);
    }
}
