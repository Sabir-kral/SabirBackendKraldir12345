package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserResponse toDTO(UserEntity user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setPassword(user.getPassword());

        return response;
    }
    public static List<UserResponse> toDTOList(List<UserEntity> users) {
    return users.stream().map(UserMapper::toDTO).collect(Collectors.toList());
    }
}
