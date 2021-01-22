package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuizResponseDto {
    private Long id;
    private String name;
    private List<QuestionResponseDto> questions;
}