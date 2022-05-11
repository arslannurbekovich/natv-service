package kg.megacom.natvservice.services;

import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.models.dto.ChannelDto;
import kg.megacom.natvservice.models.json.OrderChannelDto;
import kg.megacom.natvservice.models.json.OrderDto1;

import java.util.List;

public interface ChannelService {

    ChannelDto save(ChannelDto channelDto);

    ChannelDto update(ChannelDto channelDto);

    List<ChannelDto> findAll();

    ChannelDto findById(Long id);

    List<ChannelDto1> findAllChannels();

    OrderChannelDto save(OrderChannelDto channelsDto);

    List<ChannelDto1> findChannels();


   boolean saveOrders(OrderDto1 orderDto1);

}
