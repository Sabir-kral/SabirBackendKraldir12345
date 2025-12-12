package az.developia.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

    @Query(value = "select * from employiee where salary >1000&&salary<5000",nativeQuery = true)
    Optional<EmployeeEntity> findBySalary1(Integer salary);

    @Query(value = "select * from employee where salary >3000",nativeQuery = true)
    Optional<EmployeeEntity> findBySalary2(Integer salary);

    @Query(value = "select * from employee where email like '%.az'",nativeQuery = true)
    Optional<EmployeeEntity> findByEmailEndsWithAZ(String email);

    @Query(value = "select * from employee where experienceYear+1",nativeQuery = true)
    Optional<EmployeeEntity> findByExperienceYear(LocalDate beginDate);

    @Query(value = "select * from employee where experienceYear>5&&experienceYear<10",nativeQuery = true)
    Optional<EmployeeEntity> findByExperienceYear1(Integer begin);

    @Query(value = "select * from employee where phone like '055%'",nativeQuery = true)
    Optional<EmployeeEntity> findByPhone(Integer phone);



}
