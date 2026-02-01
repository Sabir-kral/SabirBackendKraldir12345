package az.developia.demo;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Data
public class ProductRequest {
    @NotBlank(message = "bos qoyma e bunu")
    @Size(min = 5,max = 30,message = "adi minimum 5 maksimum 30 olmalidir balaca:))")
    private String title;

    @Max(value = 3000,message = "maks 3000 mesaj balaca")
    private String description;
    @Positive(message = "qiymeti menfi ola bilmez balaca")
    @NotBlank(message = "demirem e bos qoyma")
    @Min(10)
    @Max(value = 50000,message = "e ev satirsan 50000 minden yuxari qoyma")
    private Long price;
    @NotBlank(message = "bos qoyma demedim sene")
    @PastOrPresent(message = "yeqin gelecekde alib indi satassan")
    private LocalDate productYear;
    @URL(message = "url yaz e")
    private String productLink;

}
