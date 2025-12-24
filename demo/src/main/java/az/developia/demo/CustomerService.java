package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo;
    public CustomerRequest post(CustomerRequest request){
        CustomerRequest customer = new CustomerRequest();
        customer.setName(request.getName());
        customer.setSurname(request.getSurname());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setBirthday(request.getBirthday());
        return customer;
    }
    public CustomerResponse findById(Long id){
        CustomerEntity customer = repo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        return CustomerMapper.toDTO(customer);
    }


}
