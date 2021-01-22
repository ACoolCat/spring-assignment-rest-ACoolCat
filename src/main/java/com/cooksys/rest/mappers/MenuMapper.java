package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.MenuRequestDto;
import com.cooksys.rest.dtos.MenuResponseDto;
import com.cooksys.rest.entities.Menu;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses = ItemMapper.class)
public interface MenuMapper {

    Menu requestDtoToEntity(MenuRequestDto menuRequestDto);

    MenuResponseDto entityToResponseDto(Menu menu);
}
