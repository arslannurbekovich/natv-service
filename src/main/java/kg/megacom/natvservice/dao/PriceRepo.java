package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.models.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepo extends JpaRepository<Price, Long> {

    @Query("select new kg.megacom.natvservice.models.json.ChannelDto1(u.channel.id, u.channel.name, u.channel.photo, u.price) from Price u where ?1 between  u.startDate and u.endDate and u.channel.active = true")
    List<ChannelDto1> findChannelsWithPrice(Date date);

}
