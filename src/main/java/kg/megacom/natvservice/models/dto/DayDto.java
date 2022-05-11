package kg.megacom.natvservice.models.dto;

import lombok.Data;

@Data
public class DayDto {

    private Long id;
    private OrderDetailDto orderDetail;
    private int day;
}
