package kg.megacom.natvservice.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class PriceDto {

    private Long id;
    private ChannelDto channel;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;
    private double price;

}
