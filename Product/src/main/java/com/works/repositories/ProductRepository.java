package com.works.repositories;

import com.works.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // select * from product where title like '%iphone%' or description like '%iphone%'
    List<Product> findByTitleContainsOrDescriptionContainsAllIgnoreCase(String title, String description);
}
