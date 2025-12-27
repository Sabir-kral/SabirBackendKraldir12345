package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapper {
    public static CustomerResponse toDTO(CustomerEntity customer) {
        CustomerResponse response = new CustomerResponse();
        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setSurname(customer.getSurname());
        response.setBirthday(customer.getBirthday());
        response.setUser_id(new UserEntity().getCustomer().getId());

        return response;
    }
    public static List<CustomerResponse> toDTOList(List<CustomerEntity> users) {
        return users.stream().map(CustomerMapper::toDTO).collect(Collectors.toList());
    }
}
