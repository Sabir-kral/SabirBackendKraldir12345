package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public CustomerEntity post(CustomerEntity request){
        return customerService.post(request);
    }

    @GetMapping("/{id}")
    public CustomerEntity findById(@PathVariable Integer id){
        CustomerEntity customer = customerService.findById(id);
        return customer;
    }
}
