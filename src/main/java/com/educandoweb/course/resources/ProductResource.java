package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
import com.educandoweb.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")

//End-point to access the users
public class ProductResource {

    @Autowired
    private ProductService product;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = product.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = product.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
