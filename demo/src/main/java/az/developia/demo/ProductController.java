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
}
