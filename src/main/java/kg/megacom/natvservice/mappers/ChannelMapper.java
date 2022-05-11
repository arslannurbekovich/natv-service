package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.dto.ChannelDto;
import kg.megacom.natvservice.models.entity.Channel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelMapper {

    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

    Channel toEntity(ChannelDto channelDto);

    ChannelDto toDto(Channel channel);

}
