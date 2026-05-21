package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tbl_pedido")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<ProdutoModel> produtos;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;
}
