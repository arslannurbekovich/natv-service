package kg.megacom.natvservice.services;

import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.models.dto.PriceDto;

import java.util.List;

public interface PriceService {

    PriceDto save(PriceDto priceDto);

    List<ChannelDto1> findChannelsWithPrice();

}
