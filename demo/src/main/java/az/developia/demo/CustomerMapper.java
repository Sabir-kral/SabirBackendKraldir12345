package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapper {
    public static CustomerRequest toDTO(CustomerEntity customer) {
        CustomerRequest response = new CustomerRequest();
        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setSurname(customer.getSurname());
        response.setEmail(customer.getEmail());
        response.setPhone(customer.getPhone());
        response.setBirthday(customer.getBirthday());
        return response;
    }
    public static List<CustomerRequest> toDTOList(List<CustomerEntity> customers) {
        return customers
                .stream()
                .map(CustomerMapper::toDTO)
                .collect(Collectors.toList());
    }
}
