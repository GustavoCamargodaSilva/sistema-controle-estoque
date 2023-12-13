package com.domain.controledeestoque.dto;

import com.domain.controledeestoque.entities.Category;
import com.domain.controledeestoque.entities.Filial;
import com.domain.controledeestoque.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String brand; //marca
    private String description;
    private Integer quantity;
    private Category category;
    private Filial filial;


    public ProductDTO(Product entity){
        id = entity.getId();
        name = entity.getName();
        brand = entity.getBrand();
        description = entity.getDescription();
        quantity = entity.getQuantity();
    }
}
