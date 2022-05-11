package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.dto.DiscountDto;
import kg.megacom.natvservice.models.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper {

    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    Discount toEntity(DiscountDto discountDto);

    DiscountDto toDto(Discount discount);

}
