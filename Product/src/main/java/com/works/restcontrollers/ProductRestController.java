package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductRestController {

    final ProductService productService;
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("save")
    public Product save(@Valid @RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping("saveAll")
    public List<Product> saveAll(@Valid @RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @GetMapping("list")
    public List<Product> list() {
        return productService.findAll();
    }

}
