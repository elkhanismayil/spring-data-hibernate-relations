package az.ingress.hibernaterelations.repository;

import az.ingress.hibernaterelations.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * hibernate-relations
 * Elkhan
 * 14.02.2024 08:09
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
