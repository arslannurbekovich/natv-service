package kg.megacom.natvservice.services.impl;

import kg.megacom.natvservice.dao.OrderRepo;
import kg.megacom.natvservice.mappers.OrderMapper;
import kg.megacom.natvservice.models.dto.OrderDto;
import kg.megacom.natvservice.models.json.OrderDto1;
import kg.megacom.natvservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public OrderDto save(OrderDto orderDto) {
        return OrderMapper.INSTANCE.toDto(orderRepo.save(OrderMapper.INSTANCE.toEntity(orderDto)));
    }

}
