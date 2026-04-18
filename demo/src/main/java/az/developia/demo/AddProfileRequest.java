package az.developia.demo;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Data
public class AddProfileRequest {
    @NotBlank(message = "Ad ve soyad bos olmamalidir")
    private String name;
    @NotBlank(message = "Ad ve soyad bos olmamalidir")
    private String surname;
    @Past(message = "kecmis zaman olmalidir")
    @NotBlank(message = "bos ola bilmez")
    private LocalDate birthday;
    @URL(message = "URL olmalidir")
    @NotBlank(message = "bos ola bilmez")
    private String githubUrl;
    @Size(max = 2000,message = "max 2000")
    @NotBlank(message = "bos ola bilmez")
    private String summary;
    @Min(value = 100,message = "min 100")
    @Max(value = 100000,message = "max 100000")
    @NotBlank(message = "bos ola bilmez")
    private Double salary;
    @Email(message = "email olmalidir")
    @NotBlank(message = "bos ola bilmez")
    private String email;
    @Pattern(regexp = "^055-\\d{3}-\\d{2}-\\d{2}$", message = "Telefon formatı düzgün deyil (055-XXX-XX-XX)")
    @NotBlank(message = "bos ola bilmez")
    private Long phone;

}
