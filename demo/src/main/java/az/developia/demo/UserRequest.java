package az.developia.demo;

import lombok.Data;

@Data
public class UserRequest {
    private Integer id;
    private String email;
    private Integer phone;
    private String password;
}
