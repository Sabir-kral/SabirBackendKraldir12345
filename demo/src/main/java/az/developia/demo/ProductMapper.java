package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {
    public static ProductResponse toDTO(ProductEntity product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setCustomer_Name(product.getCustomer().getName());
        response.setCustomer_surname(product.getCustomer().getSurname());
        return response;
    }
    public static List<ProductResponse> toDTOList(List<ProductEntity> products) {
        return products
                .stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }
}
