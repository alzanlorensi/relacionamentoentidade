package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="pessoaCadastro")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pessoaId;

    @Column
    private String pessoaNome;

    @OneToMany(mappedBy = "pessoa_fk",fetch = FetchType.LAZY) //nome do atributo que está na classe dona da chave primária
    private List<Emprego> empregos;

    @OneToMany(mappedBy = "pessoa") //atributo na tabela dona que aponta pra essa classe
    List<Cartao> cartoes;
}
