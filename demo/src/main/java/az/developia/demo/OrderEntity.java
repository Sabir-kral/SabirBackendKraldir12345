package az.developia.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "orders")
    private CustomerEntity customer_id;

    @ManyToOne
    @JoinColumn(name = "products")
    private ProductEntity product_id;
}
