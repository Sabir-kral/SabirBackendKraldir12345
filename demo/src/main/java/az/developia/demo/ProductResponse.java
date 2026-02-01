package az.developia.demo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProductResponse {
    private Long id;
    private String title;
    private String description;
    private Long price;
    private LocalDate productYear;
    private String productLink;

}
