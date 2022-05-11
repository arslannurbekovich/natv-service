package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.dto.PriceDto;
import kg.megacom.natvservice.models.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price toEntity(PriceDto priceDto);

    PriceDto toDto(Price price);

}
