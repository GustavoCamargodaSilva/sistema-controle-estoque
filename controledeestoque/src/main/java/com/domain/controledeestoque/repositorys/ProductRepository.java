package com.domain.controledeestoque.repositorys;

import com.domain.controledeestoque.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long>{

}
