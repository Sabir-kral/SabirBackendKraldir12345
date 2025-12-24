package az.developia.demo;

import lombok.Data;

@Data
public class ProductResponse {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private String customer_Name;
    private String customer_surname;
}
