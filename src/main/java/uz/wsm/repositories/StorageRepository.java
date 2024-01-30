package uz.wsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.wsm.entities.Storage;

public interface StorageRepository extends JpaRepository<Storage, Long> {
}
