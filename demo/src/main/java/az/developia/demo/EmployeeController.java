package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public EmployeeEntity MinSalaryAndMaxSalary(@RequestParam(name = "salary") Integer salary){
    return employeeService.findbysalary1(salary);

    }

    @GetMapping("/salary2")
    public EmployeeEntity Salary2(@RequestParam(name = "salary2") Integer salary){
        return employeeService.findbysalary2(salary);
    }

    @GetMapping("/email")
    public EmployeeEntity email(@RequestParam(name = "email") String email){
        return employeeService.findbyEmail(email);
    }

    @GetMapping("/begin")
    public EmployeeEntity BeginDate(@RequestParam(name = "beginDate")LocalDate begin){
        return employeeService.findbyBeginDate(begin);
    }
    @GetMapping("/experience")
    public EmployeeEntity experience(@RequestParam(name = "Experience") Integer experience){
        return employeeService.findbyExperience(experience);

    }

    public EmployeeEntity phone(@RequestParam(name = "phone") Integer phone){
        return employeeService.findbyPhone(phone);
    }

}
