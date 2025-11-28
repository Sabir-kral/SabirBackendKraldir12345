package az.developia.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepostory extends JpaRepository<CarEntity, Long> {
    List<CarEntity> findByBrandContainingIgnoreCase(String Brand);

}
