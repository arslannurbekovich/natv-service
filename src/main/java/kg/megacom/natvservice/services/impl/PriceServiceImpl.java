package kg.megacom.natvservice.services.impl;

import kg.megacom.natvservice.dao.PriceRepo;
import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.mappers.PriceMapper;
import kg.megacom.natvservice.models.dto.PriceDto;
import kg.megacom.natvservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepo priceRepo;

    @Override
    public PriceDto save(PriceDto priceDto) {
        return PriceMapper.INSTANCE.toDto(priceRepo.save(PriceMapper.INSTANCE.toEntity(priceDto)));
    }

    @Override
    public List<ChannelDto1> findChannelsWithPrice() {
        return priceRepo.findChannelsWithPrice(new Date());
    }
}
