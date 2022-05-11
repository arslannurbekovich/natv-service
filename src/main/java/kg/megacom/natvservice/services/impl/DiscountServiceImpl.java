package kg.megacom.natvservice.services.impl;

import kg.megacom.natvservice.dao.DiscountRepo;
import kg.megacom.natvservice.exceptions.NotFound;
import kg.megacom.natvservice.models.json.DiscountDto1;
import kg.megacom.natvservice.mappers.DiscountMapper;
import kg.megacom.natvservice.models.dto.DiscountDto;
import kg.megacom.natvservice.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepo discountRepo;

    @Override
    public DiscountDto save(DiscountDto discountDto) {
        return DiscountMapper.INSTANCE.toDto(discountRepo.save(DiscountMapper.INSTANCE.toEntity(discountDto)));
    }

    @Override
    public DiscountDto update(DiscountDto discountDto) {
        if(!discountRepo.existsById(discountDto.getId())){
            throw new NotFound("Не найдено!");
        }
        return DiscountMapper.INSTANCE.toDto(discountRepo.save(DiscountMapper.INSTANCE.toEntity(discountDto)));
    }

    @Override
    public List<DiscountDto> findAll() {
        return null;
    }

    @Override
    public DiscountDto findById(Long id) {
        return null;
    }

    @Override
    public List<DiscountDto1> findDiscountsByChannelID(Long id) {
        return discountRepo.findDiscountsByChannelId(id, new Date());
    }

}
