package uz.wsm.repositories;

import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import uz.wsm.entities.Products;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Long> {
    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Products> findById(Long id);

    @Query()
    Optional<Products> findByIdV2(Long id);
}
