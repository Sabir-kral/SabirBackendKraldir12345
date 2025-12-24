package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> findAll(){
        return productService.list();

    }
    @PostMapping
    public ProductRequest post(@RequestBody ProductRequest request){
        return productService.register(request);
    }

    @PutMapping
    public ProductRequest update(@RequestBody ProductRequest request) {
        return productService.update(request);
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable Long id){
        return productService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         productService.delete(id);
    }
//    @GetMapping("/customers")
//    public void findByCustomers(@RequestParam CustomerResponse customer){
//         productService.findByCustomer(customer);
//    }

}
