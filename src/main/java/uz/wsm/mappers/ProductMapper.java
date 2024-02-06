package uz.wsm.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import uz.wsm.dtos.product.AddProductDTO;
import uz.wsm.entities.Products;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    Products toEntity(AddProductDTO dto);


}
