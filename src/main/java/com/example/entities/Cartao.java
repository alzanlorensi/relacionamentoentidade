package com.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cartao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cartao {
    @Id
    @Column(name = "cartaoid")
    private Long cartaoId;

    @Column(name = "numero")
    private Integer numeros;

    @ManyToOne
    @JoinColumn(name = "proprieitario_cartao")
    private Pessoa pessoa;

    @ManyToMany
    @JoinTable(name = "cartao_pessoa", //nome da minha tabela
            joinColumns = @JoinColumn(name = "cartao_fk"), //nome da coluna da tabela que aponta para a PK
            inverseJoinColumns = @JoinColumn (name = "pessoa_fk")) //nome da segunda coluna da tabela que aponta para a PK
    Set<Compra> compras;

    //!Pq usar Set ao invvés de List?
    //?Set é um conjunto, já o list ele permite que tipo eu tenha multiplos registros na tabela exemplo chave 1 de carta e chave 1 de compra
    //?Se euquero que isso se repita eu uso List caso eu n queira eu uso o set
}
