package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.json.DiscountDto1;
import kg.megacom.natvservice.models.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Long> {

    @Query("select u from Discount u where u.channel.id = ?1 and ?2 between u.startDate and u.endDate")
    List<DiscountDto1> findDiscountsByChannelId(Long channelId, Date date);

}
