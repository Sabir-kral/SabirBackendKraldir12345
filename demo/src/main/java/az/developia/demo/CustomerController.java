package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public CustomerRequest post(CustomerRequest request){
        return customerService.post(request);
    }

    @GetMapping("/{id}")
    public CustomerResponse findById(@PathVariable Long id){
        CustomerResponse customer = customerService.findById(id);
        return customer;
    }
}
