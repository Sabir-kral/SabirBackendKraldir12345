package az.developia.demo;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private Integer price;
}
