package com.cooksys.rest.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ItemMapper {
    ItemResponseDto entityToResponseDto(Item item);
    Item requestDtoToEntity(ItemRequestDto itemRequestDto);
}
