package kg.megacom.natvservice.services.impl;

import kg.megacom.natvservice.dao.ChannelRepo;
import kg.megacom.natvservice.exceptions.NotFound;
import kg.megacom.natvservice.models.entity.Order;
import kg.megacom.natvservice.models.entity.OrderDetail;
import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.mappers.ChannelMapper;
import kg.megacom.natvservice.models.dto.ChannelDto;
import kg.megacom.natvservice.models.entity.Channel;
import kg.megacom.natvservice.models.json.OrderChannelDto;
import kg.megacom.natvservice.models.json.DiscountDto1;
import kg.megacom.natvservice.models.json.OrderDto1;
import kg.megacom.natvservice.models.sql.ChannelResultSet;
import kg.megacom.natvservice.models.sql.OrderSave;
import kg.megacom.natvservice.services.ChannelService;
import kg.megacom.natvservice.services.DiscountService;
import kg.megacom.natvservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelRepo channelRepo;

    @Autowired
    private PriceService priceService;

    @Autowired
    private DiscountService discountService;

    @Autowired
    private ChannelService channelService;

    @Override
    public ChannelDto save(ChannelDto channelDto) {
        return ChannelMapper.INSTANCE.toDto(channelRepo.save(ChannelMapper.INSTANCE.toEntity(channelDto)));
    }

    @Override
    public ChannelDto update(ChannelDto channelDto) {
        if(!channelRepo.existsById(channelDto.getId())){
            throw new NotFound("Канал не найден!");
        }
        return ChannelMapper.INSTANCE.toDto(channelRepo.save(ChannelMapper.INSTANCE.toEntity(channelDto)));
    }

    @Override
    public List<ChannelDto> findAll() {
        List<Channel> channels = channelRepo.findAll();
        List<ChannelDto> channelDtos = channels
                .stream()
                .map(x-> ChannelMapper.INSTANCE.toDto(x))
                .collect(Collectors.toList());
        return channelDtos;
    }

    @Override
    public ChannelDto findById(Long id) {
        Channel channel = channelRepo.findById(id)
                .orElseThrow(() -> new NotFound("Канал не найден!"));
        return ChannelMapper.INSTANCE.toDto(channel);
    }

    @Override
    public List<ChannelDto1> findAllChannels() {
        List<ChannelDto1> channelDtos = priceService.findChannelsWithPrice();
        channelDtos.forEach(
                x -> x.setDiscounts(discountService.findDiscountsByChannelID(x.getId()))
        );
        return channelDtos;
    }

    @Override
    public OrderChannelDto save(OrderChannelDto channelsDto) {
        return null;
    }

    @Override
    public List<ChannelDto1> findChannels() {
        List<ChannelResultSet> list = channelRepo.findAllChannels();

        List<ChannelDto1> channelDtos = new ArrayList<>();

        list.forEach(x->{
            long count = channelDtos.stream()
                    .filter(y->y.getId() == x.getId())
                    .count();

            if (count == 0){
                ChannelDto1 channelDto = new ChannelDto1();
                channelDto.setId(x.getId());
                channelDto.setName(x.getName());
                channelDto.setPhoto(x.getPhoto());
                channelDto.setPrice(x.getPrice());

                List<DiscountDto1> discountDtos = new ArrayList<>();
                DiscountDto1 discountDto = new DiscountDto1();
                discountDto.setMinDays(x.getMinDays());
                discountDto.setPercent(x.getPercent());
                discountDtos.add(discountDto);

                channelDto.setDiscounts(discountDtos);

                channelDtos.add(channelDto);

            }else{

                ChannelDto1 channelDto = channelDtos.stream()
                        .filter(y->y.getId() == x.getId())
                        .findFirst().get();

                List<DiscountDto1> discountDtos = channelDto.getDiscounts();

                DiscountDto1 discountDto = new DiscountDto1();
                discountDto.setMinDays(x.getMinDays());
                discountDto.setPercent(x.getPercent());
                discountDtos.add(discountDto);

            }

        });

        return channelDtos;

       /* Calendar calendar = Calendar.getInstance();


        Order order = new Order();
        order.setEmail(orderDto1.getEmail());
        order.setName(orderDto1.getName());
        order.setPhone(orderDto1.getPhone());
        order.setAddDate(calendar.getTime());
        order.setEditDate(calendar.getTime());

        orderDto1.getChannels()
                .stream()
                .forEach(x ->{
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setPrice(orderDto1.getTotalPrice());
                });

        OrderChannelDto orderChannelDto = new OrderChannelDto();
        Channel channel = channelService.findById(());
        orderChannelDto.getDays(orderDto1.setChannels(channelRepo.);)



        return false;*/
    }

}
