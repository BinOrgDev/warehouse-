package uz.wsm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import uz.wsm.enums.OperationType;

import java.math.BigDecimal;

@Entity
public class ProductOperations extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private BigDecimal amount;
    private String employee;
    @ManyToOne
    private Products products;
}
