package az.ingress.hibernaterelations.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * hibernate-relations
 * Elkhan
 * 13.02.2024 22:48
 */
@Entity
@Table(name = "product_detail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String brand;
    private Boolean warranty;
    @OneToOne(mappedBy = "productDetail", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Product product;
}
