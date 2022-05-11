package kg.megacom.natvservice.models.dto;

import lombok.Data;

@Data
public class ChannelDto {

    private Long id;
    private String name;
    private String photo;
    private boolean active;
    private int orderNum;

}
