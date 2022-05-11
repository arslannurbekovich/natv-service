package kg.megacom.natvservice.models.sql;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderSave {

    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private Long channelId;
    private double price;
    private String days;


    public OrderSave(String text, String name, String phone, String email, double totalPrice, Long channelId, double price, String days) {
        this.text = text;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.totalPrice = totalPrice;
        this.channelId = channelId;
        this.price = price;
        this.days = days;
    }

}
