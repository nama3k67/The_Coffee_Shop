package lab.project.coffeeShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.project.coffeeShop.entities.Product;
import lab.project.coffeeShop.exception.ResourceNotFoundException;
import lab.project.coffeeShop.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductAPI {
	@Autowired
	private ProductService productService; 
	
	@GetMapping("/all")
	public List<Product> getAll(){
		return (List<Product>)productService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id)); 
	}
	
	@PostMapping("/insert")
	public Product insertProduct(@Validated @RequestBody Product product) {
		return productService.save(product); 
	}
	
	
}
