package com.cooksys.rest.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionResponseDto {
    private Long id;
    private String questionText;
    private List<AnswerRequestDto> answers;
}