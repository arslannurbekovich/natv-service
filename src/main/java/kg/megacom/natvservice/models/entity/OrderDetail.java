package kg.megacom.natvservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channel idChannel;

    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Order idOrder;

    private double price;

}
