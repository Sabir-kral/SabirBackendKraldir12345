package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductEntity post(ProductEntity request){
        return productService.register(request);
    }

    @PutMapping
    public ProductEntity update(@RequestBody ProductEntity request) {
        return productService.update(request);
    }

    @GetMapping("/{id}")
    public ProductEntity findById(@PathVariable Long id){
        return productService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         productService.delete(id);
    }
    @GetMapping("/customers")
    public void findByCustomers(@RequestParam CustomerEntity customer){
         productService.findByCustomer(customer);
    }

}
