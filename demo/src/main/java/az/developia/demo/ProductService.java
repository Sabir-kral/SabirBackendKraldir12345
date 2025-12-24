package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public ProductRequest register(ProductRequest request){
        ProductRequest product = new ProductRequest();
        product.setId(request.getId());
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
    public ProductResponse findById(Long id){
        ProductEntity productResponse = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        return ProductMapper.toDTO(productResponse);
    }
    public List<ProductResponse> list(){
        return ProductMapper.toDTOList(productRepo.findAll());
    }
    public void delete(Long id){
        ProductEntity product = productRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
         productRepo.delete(product);
    }

//    public ProductResponse findByCustomer(CustomerResponse customer){
//        return CustomerMapper.toDTOList(customer);
//    }

}
