package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class QuestionResponseDto {
    private Long id;
    private String answerText;
    private Boolean isCorrect;
}