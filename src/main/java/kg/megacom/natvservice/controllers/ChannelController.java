package kg.megacom.natvservice.controllers;

import kg.megacom.natvservice.models.dto.ChannelDto;
import kg.megacom.natvservice.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @PostMapping("/save")
    public ChannelDto save(@RequestBody ChannelDto channelDto) {
        return channelService.save(channelDto);
    }

    @PostMapping("/update")
    public ChannelDto update(@RequestBody ChannelDto channelDto){
        return channelService.update(channelDto);
    }

    @GetMapping("/all")
    public List<ChannelDto> findAll() {
        return channelService.findAll();
    }

    @GetMapping("/{id}")
    public ChannelDto findById(@PathVariable Long id) {
        return channelService.findById(id);
    }

}
