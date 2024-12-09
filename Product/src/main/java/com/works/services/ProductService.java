package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


}
