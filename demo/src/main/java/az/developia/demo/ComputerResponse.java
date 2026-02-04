package az.developia.demo;

import lombok.Data;

@Data
public class ComputerResponse {
    private Long id;
    private String brand;
    private String model;
    private Long price;
    private String color;
}
