package com.domain.controledeestoque.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_filial")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    
   @OneToMany(mappedBy = "filial")

   private Set<Product> products = new HashSet<>();

   @OneToOne
   private Address address;

}
