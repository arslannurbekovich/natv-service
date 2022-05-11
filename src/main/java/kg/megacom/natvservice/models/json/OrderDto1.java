package kg.megacom.natvservice.models.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto1 {

    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private List<OrderChannelDto> channels;

}
