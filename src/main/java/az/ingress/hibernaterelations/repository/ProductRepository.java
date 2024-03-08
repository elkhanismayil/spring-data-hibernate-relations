package az.ingress.hibernaterelations.repository;

import az.ingress.hibernaterelations.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * hibernate-relations
 * Elkhan
 * 14.02.2024 08:08
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
