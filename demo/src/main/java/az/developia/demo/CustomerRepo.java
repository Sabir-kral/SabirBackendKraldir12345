package az.developia.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity,Long> {
CustomerEntity findById(Integer id);
}
