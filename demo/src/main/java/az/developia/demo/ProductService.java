package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public ProductRequest register(ProductRequest request){
        ProductRequest product = new ProductRequest();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return product;
    }

    public ProductRequest update(ProductRequest request) {
        ProductEntity product = productRepo.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Not found"));
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        productRepo.save(product);
        return new ProductRequest();
    }
    public ProductRequest findById(Long id){
        ProductEntity productRequest = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        return new ProductRequest();
    }
    public void delete(Long id){
        ProductEntity product = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
         productRepo.delete(product);
    }

    public void findByCustomer(CustomerRequest customer){
        productRepo.findByCustomer(customer);
    }

}
