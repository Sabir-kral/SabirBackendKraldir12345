package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public List<CustomerResponse> findAll(){
        return CustomerMapper.toDTOList(customerRepo.findAll());
    }
    public CustomerResponse add(CustomerRequest request){
        CustomerEntity customer = new CustomerEntity();
        customer.setName(request.getName());
        customer.setSurname(request.getSurname());
        customer.setBirthday(request.getBirthday());
        customer.setUser_id(new UserEntity().getCustomer().getUser_id());
        customerRepo.save(customer);
        return CustomerMapper.toDTO(customer);
    }
}
