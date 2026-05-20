package com.example.demo.models;


import lombok.Data;

import java.util.List;

@Data
public class PedidoModel {

    private ClienteModel cliente;
    private List<ProdutoModel> produtos;
}
