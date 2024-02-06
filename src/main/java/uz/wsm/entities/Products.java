package uz.wsm.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
public class Products extends BaseEntity {
    private String name;
    private String unit;
//    @Version
//    private Integer version;
    private Long quantity;
//    @ManyToOne
//    private Storage storage;
}
