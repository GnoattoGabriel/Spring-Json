package com.example.demo.controllers;

import com.example.demo.models.PedidoModel;
import com.example.demo.models.ProdutoModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pedido")
public class PedidoController {

    @PostMapping
    public String receberPedido(@RequestBody PedidoModel pedido) {

        System.out.println(pedido.getCliente().getNome());

        for(ProdutoModel p : pedido.getProdutos()) {
            System.out.println(p.getNome());
        }

        return "OK";
    }
}
