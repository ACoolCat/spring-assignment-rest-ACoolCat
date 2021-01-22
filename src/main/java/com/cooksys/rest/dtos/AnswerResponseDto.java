package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class AnswerResponseDto {
    private Long id;
    private String answerText;
    private Boolean isCorrect;
}