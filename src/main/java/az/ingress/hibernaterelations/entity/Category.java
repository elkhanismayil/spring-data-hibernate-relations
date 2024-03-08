package az.ingress.hibernaterelations.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * hibernate-relations
 * Elkhan
 * 13.02.2024 22:46
 */
@Entity
@Table(name = "category")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;

    @OneToMany(mappedBy = "category", orphanRemoval = true, cascade = CascadeType.REMOVE)
    private List<Product> products;
}
