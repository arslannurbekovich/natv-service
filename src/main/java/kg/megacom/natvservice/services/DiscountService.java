package kg.megacom.natvservice.services;

import kg.megacom.natvservice.models.json.DiscountDto1;
import kg.megacom.natvservice.models.dto.DiscountDto;

import java.util.List;

public interface DiscountService {

    DiscountDto save(DiscountDto discountDto);

    DiscountDto update(DiscountDto discountDto);

    List<DiscountDto> findAll();

    DiscountDto findById(Long id);

    List<DiscountDto1> findDiscountsByChannelID(Long id);

}
