package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {
    public static ProductRequest toDTO(ProductEntity product) {
        ProductRequest response = new ProductRequest();
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        return response;
    }
    public static List<ProductRequest> toDTOList(List<ProductEntity> products) {
        return products
                .stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }
}
