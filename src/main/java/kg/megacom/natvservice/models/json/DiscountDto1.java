package kg.megacom.natvservice.models.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDto1 {

    private int minDays;
    private double percent;

}
