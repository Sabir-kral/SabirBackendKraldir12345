package az.developia.demo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final LogService logService;

    @Transactional
public CustomerResponse add(CustomerRequest request){
    CustomerEntity customer = new CustomerEntity();
    customer.setName(request.getName());
    customer.setSurname(request.getSurname());
    customerRepo.save(customer);

    logService.create("User registered with username: "+customer.getName(), "USER_REGISTERED");
    return CustomerMapper.toDTO(customer);
}
    @Transactional
public void delete(Long id){
    CustomerEntity customer = customerRepo.findById(id).orElseThrow(()->new RuntimeException("not found"));
    customerRepo.delete(customer);
    logService.create("User deleted account name: "+customer.getName(), "USER_DELETED");
}
}
