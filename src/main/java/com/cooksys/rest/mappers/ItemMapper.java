package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.ItemRequestDto;
import com.cooksys.rest.dtos.ItemResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ItemMapper {
    ItemResponseDto entityToResponseDto(Item item);
    Item requestDtoToEntity(ItemRequestDto itemRequestDto);
}