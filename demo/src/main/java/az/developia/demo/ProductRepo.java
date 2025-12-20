package az.developia.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Long> {
    Optional<ProductEntity> findById(Integer id);
    List<ProductEntity> findByCustomer(CustomerEntity customer);
    @Query(value = "select * from products where name like 'A-Z%'",nativeQuery = true)
    List<ProductEntity> searchByProductsByName(ProductEntity name);


    List<ProductEntity> delete(Long id);
}
