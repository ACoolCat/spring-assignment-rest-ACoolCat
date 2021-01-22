package com.cooksys.rest.dtos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MenuRequestDto {
    private String name;
    private List<ItemRequestDto> items;
}