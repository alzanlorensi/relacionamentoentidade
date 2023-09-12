package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emprego")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Emprego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    //@JoinColumn(name = "pessoa_chave_estrangeira")//aqui eu simplesmente coloco o nome da coluna que quero para mapear
    //Se eu deixo sem ela vai criar a tabela com nome (pessoa_fk_pessoaid)
    private Pessoa pessoa_fk;
}
