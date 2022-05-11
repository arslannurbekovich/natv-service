package kg.megacom.natvservice.controllers;

import kg.megacom.natvservice.models.dto.DiscountDto;
import kg.megacom.natvservice.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping("/save")
    public DiscountDto save(@RequestBody DiscountDto discountDto) {
        return discountService.save(discountDto);
    }

    @PostMapping("/update")
    public DiscountDto update(@RequestBody DiscountDto discountDto){
        return discountService.update(discountDto);
    }

    @GetMapping("/all")
    public List<DiscountDto> findAll() {
        return discountService.findAll();
    }

    @GetMapping("/{id}")
    public DiscountDto findById(@PathVariable Long id) {
        return discountService.findById(id);
    }

}
