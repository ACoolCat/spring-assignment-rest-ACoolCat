package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MenuResponseDto {
    private Long id;
    private String name;
    private List<ItemResponseDto> items;
}
