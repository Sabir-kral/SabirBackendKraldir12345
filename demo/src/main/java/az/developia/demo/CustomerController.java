package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    private List<CustomerResponse> findAll(){
        return customerService.findAll();
    }
    @PostMapping
    public CustomerResponse add(@RequestBody CustomerRequest request){
        return customerService.add(request);
    }
}
