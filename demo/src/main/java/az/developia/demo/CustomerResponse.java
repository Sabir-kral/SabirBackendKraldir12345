package az.developia.demo;

import lombok.Data;

@Data
public class CustomerResponse {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String birthday;
}
