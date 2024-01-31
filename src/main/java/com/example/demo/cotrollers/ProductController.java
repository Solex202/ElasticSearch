package com.example.demo.cotrollers;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {


    private final ProductService productService;

     @GetMapping("/all")
    public Iterable<Product> getAllProducts() {
         return productService.getAllProducts();

     }

     @PostMapping
    public void saveProduct(Product product) {
         productService.saveOrUpdate(product);
     }
}
