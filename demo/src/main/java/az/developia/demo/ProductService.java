package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public ProductEntity register(ProductEntity request){
        ProductEntity product = new ProductEntity();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return product;
    }

    public ProductEntity update(ProductEntity request) {
        ProductEntity product = productRepo.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Not found"));
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        productRepo.save(product);
        return product;
    }
    public ProductEntity findById(Long id){
        return productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
    }
    public void delete(Long id){
        ProductEntity product = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
         productRepo.delete(product);
    }

    public void findByCustomer(CustomerEntity customer){
        productRepo.findByCustomer(customer);
    }

}
