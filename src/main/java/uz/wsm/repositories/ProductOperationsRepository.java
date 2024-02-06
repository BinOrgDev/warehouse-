package uz.wsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.wsm.entities.ProductOperations;

public interface ProductOperationsRepository extends JpaRepository<ProductOperations, Long> {
}
