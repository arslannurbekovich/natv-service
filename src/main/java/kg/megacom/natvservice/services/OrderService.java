package kg.megacom.natvservice.services;

import kg.megacom.natvservice.models.dto.OrderDto;
import kg.megacom.natvservice.models.json.OrderDto1;

public interface OrderService {

    OrderDto save(OrderDto orderDto);

}
