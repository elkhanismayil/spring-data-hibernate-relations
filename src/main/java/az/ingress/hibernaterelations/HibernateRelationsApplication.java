package az.ingress.hibernaterelations;

import az.ingress.hibernaterelations.entity.Category;
import az.ingress.hibernaterelations.entity.Product;
import az.ingress.hibernaterelations.entity.ProductDetail;
import az.ingress.hibernaterelations.entity.Tag;
import az.ingress.hibernaterelations.repository.CategoryRepository;
import az.ingress.hibernaterelations.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class HibernateRelationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateRelationsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductRepository productRepository, CategoryRepository categoryRepository) {
        return args -> {
            Category category = categoryRepository.findById(1)
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            ProductDetail productDetail = ProductDetail.builder()
                    .brand("Apple")
                    .description("Awesome phone")
                    .warranty(true)
                    .build();
            Set<Tag> tags = Set.of(
                    Tag.builder().name("tag1").build(),
                    Tag.builder().name("tag2").build(),
                    Tag.builder().name("tag3").build()
            );

            Product product = Product.builder()
                    .name("iPhone 15")
                    .quantity(20)
                    .productDetail(productDetail)
                    .category(category)
                    .tags(tags)
                    .build();
            productRepository.save(product);

            productRepository.deleteById(1);
        };
    }

}
