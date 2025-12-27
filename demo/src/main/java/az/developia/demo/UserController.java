package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    private List<UserResponse> findAll(){
        return userService.findAll();
    }
    @PostMapping
    public UserResponse add(@RequestBody UserRequest request){
        return userService.add(request);
    }
}
