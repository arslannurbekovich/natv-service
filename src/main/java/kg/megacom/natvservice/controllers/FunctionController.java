package kg.megacom.natvservice.controllers;

import kg.megacom.natvservice.models.json.ChannelDto1;
import kg.megacom.natvservice.models.json.OrderDto1;
import kg.megacom.natvservice.models.sql.OrderSave;
import kg.megacom.natvservice.services.ChannelService;
import kg.megacom.natvservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/func")
public class FunctionController {

    @Autowired
    private ChannelService channelService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/channel/list")
    public List<ChannelDto1> findChannels(){
        return channelService.findAllChannels();
    }

    @PostMapping("/order/save")
    public ResponseEntity<?> saveOrders(@RequestBody OrderSave orderSave){
        return ResponseEntity.ok(orderService.saveOrder(orderSave));
    }

    @GetMapping("/channel/all")
    public List<ChannelDto1>  findAllChannels(){
        return channelService.findChannels();
    }

}
