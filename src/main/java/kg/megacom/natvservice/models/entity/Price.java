package kg.megacom.natvservice.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

     @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channel channel;

    private Date startDate;
    private Date endDate;
    private double price;


}
