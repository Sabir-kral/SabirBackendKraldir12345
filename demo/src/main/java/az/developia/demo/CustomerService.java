package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo;
    public CustomerEntity post(CustomerEntity request){
        CustomerEntity customer = new CustomerEntity();
        customer.setName(request.getName());
        customer.setSurname(request.getSurname());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setBirthday(request.getBirthday());
        return customer;
    }
    public CustomerEntity findById(Integer id){
        return repo.findById(id);
    }


}
