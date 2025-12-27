package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public List<UserResponse> findAll(){
        return UserMapper.toDTOList(userRepo.findAll());
    }
    public UserResponse add(UserRequest request){
        UserEntity user = new UserEntity();
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setPassword(request.getPassword());
        userRepo.save(user);
        return UserMapper.toDTO(user);
    }
}
