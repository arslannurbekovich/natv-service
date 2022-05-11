package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.dto.OrderDto;
import kg.megacom.natvservice.models.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order toEntity(OrderDto orderDto);

    OrderDto toDto(Order order);

}
