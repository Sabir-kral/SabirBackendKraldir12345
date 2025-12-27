package az.developia.demo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerRequest {
    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Integer user_id;
    private ProductEntity product_id;
    private OrderEntity orders;
}
