package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_produto")
@Data
public class ProdutoModel {

    @Id
    private Long id;
    private String nome;
    private Double preco;



}
