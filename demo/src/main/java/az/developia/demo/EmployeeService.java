package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;


    public EmployeeEntity findbysalary1(Integer salary){
        EmployeeEntity employeeEntity = employeeRepo.findBySalary1(salary).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
    public EmployeeEntity findbysalary2(Integer salary){
        EmployeeEntity employeeEntity = employeeRepo.findBySalary2(salary).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
    public EmployeeEntity findbyEmail(String email){
        EmployeeEntity employeeEntity = employeeRepo.findByEmailEndsWithAZ(email).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
    public EmployeeEntity findbyBeginDate(LocalDate begindate){
        EmployeeEntity employeeEntity = employeeRepo.findByExperienceYear(begindate).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
    public EmployeeEntity findbyExperience(Integer experience){
        EmployeeEntity employeeEntity = employeeRepo.findByExperienceYear1(experience).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
    public EmployeeEntity findbyPhone(Integer phone){
        EmployeeEntity employeeEntity = employeeRepo.findByPhone(phone).orElseThrow(()->new RuntimeException("not found"));
        return employeeEntity;

    }
}
