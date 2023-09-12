package com.example.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "compra")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compraid")
    @NotNull
    private Long compraId;


    @ManyToMany(mappedBy = "compras") //nome do atributo que vai guardar o relacionamento
    Set<Cartao> cartoes;


}
