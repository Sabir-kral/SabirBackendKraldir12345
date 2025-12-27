package az.developia.demo;

import lombok.Data;

@Data
public class UserResponse {
    private Integer id;
    private String email;
    private Integer phone;
    private String password;
}
