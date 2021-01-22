package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionRequestDto {
    private String questionText;
    private List<QuestionResponseDto> answers;
}