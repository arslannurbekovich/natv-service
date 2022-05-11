package kg.megacom.natvservice.models.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChannelDto1 {

    private Long id;
    private String name;
    private String photo;
    private double price;
    private List<DiscountDto1> discounts;

    public ChannelDto1(Long id, String name, String photo, double price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

}
