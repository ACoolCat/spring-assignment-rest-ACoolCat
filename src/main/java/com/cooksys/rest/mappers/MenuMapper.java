package com.cooksys.rest.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses = ItemMapper.class)
public interface MenuMapper {

    Menu requestDtoToEntity(MenuRequestDto menuRequestDto);

    MenuResponseDto entityToResponseDto(Menu menu);
}
