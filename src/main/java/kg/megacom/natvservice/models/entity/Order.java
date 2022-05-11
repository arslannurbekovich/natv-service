package kg.megacom.natvservice.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private Date editDate;
    private Date addDate;
    private boolean status;

}
