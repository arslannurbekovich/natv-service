package kg.megacom.natvservice.models.sql;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChannelResultSet {

    private Long id;
    private String name;
    private String photo;
    private double price;
    private int minDays;
    private double percent;

    public ChannelResultSet(Long id, String name, String photo, double price, int minDays, double percent) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.minDays = minDays;
        this.percent = percent;
    }

}
