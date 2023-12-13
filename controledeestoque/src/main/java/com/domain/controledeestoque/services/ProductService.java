package com.domain.controledeestoque.services;

import com.domain.controledeestoque.dto.ProductDTO;
import com.domain.controledeestoque.entities.Product;
import com.domain.controledeestoque.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public ProductDTO findById(Long id){
        Product product  = repository.findById(id).orElseThrow();
        return new ProductDTO(product);
    }
}
