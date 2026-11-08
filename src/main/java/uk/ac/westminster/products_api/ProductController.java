package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    // Spring creates the ProductService and hands it over
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getproductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/products")
    public DigitalProduct addProduct(@RequestBody DigitalProduct product) {
        //Product is abstract, so this endpoint accepts DigitalProduct instead
        return (DigitalProduct) productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deletProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name){
        return productService.findByname(name);
    }

    @GetMapping("/products/summeries")
    public List<String> getSummaries(){
        return productService.getAllSummaries();
    }
}

