package com.works;

import com.works.models.ProductModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("product")
public interface IProduct {

    @GetMapping("/product/list")
    ProductModel productList(@RequestParam Integer pageNumber);

}
