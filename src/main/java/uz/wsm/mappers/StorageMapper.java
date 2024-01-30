package uz.wsm.mappers;

import org.mapstruct.*;
import uz.wsm.dtos.storage.AddStorageDTO;
import uz.wsm.dtos.storage.UpdateStorageDTO;
import uz.wsm.entities.Storage;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StorageMapper {

    Storage toEntity(AddStorageDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(@MappingTarget Storage storage, UpdateStorageDTO dto);
}
