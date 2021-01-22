package com.cooksys.rest.dtos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuizRequestDto {
    private String name;
    private List<ItemRequestDto> questions;
}