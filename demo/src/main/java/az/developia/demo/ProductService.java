package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public void add(ProductRequest request){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setTitle(request.getTitle());
        productEntity.setDescription(request.getDescription());
        productEntity.setPrice(request.getPrice());
        productEntity.setProductYear(request.getProductYear());
        productEntity.setProductLink(request.getProductLink());

        productRepo.save(productEntity);
    }

    public void delete(Long id){
        ProductEntity productEntity = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        productRepo.delete(productEntity);
    }
}
