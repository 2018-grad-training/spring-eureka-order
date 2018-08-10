package cn.thoughtworks.springeurekaorder.controller;

import cn.thoughtworks.springeurekaorder.entity.Product;
import cn.thoughtworks.springeurekaorder.restService.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    ProductClient productClient;

    @GetMapping("some/products/{productId}")
    public ResponseEntity<Product> getOrderProduct(@PathVariable Integer productId) {
        Product product = productClient.getProductById(productId);
        return ResponseEntity.ok(product);
    }

}
