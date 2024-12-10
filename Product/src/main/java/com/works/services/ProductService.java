package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<Product> saveAll(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public Page<Product> findAll(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 10);
        return productRepository.findAll(pageable);
    }

    public Page<Product> search(String q, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 10);
        Page<Product> productList = productRepository.findByTitleContainsOrDescriptionContainsAllIgnoreCase(q,q, pageable);
        return productList;
    }


}
