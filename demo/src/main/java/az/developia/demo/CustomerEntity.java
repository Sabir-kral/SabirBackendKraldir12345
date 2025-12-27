package az.developia.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private LocalDate birthday;

    @OneToOne
    @JoinColumn(name = "customer")
    private UserEntity user_id;

    @OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ProductEntity> products;

    @OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrderEntity> orders;


}
