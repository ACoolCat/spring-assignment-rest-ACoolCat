package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.QuizRequestDto;
import com.cooksys.rest.dtos.QuizResponseDto;
import com.cooksys.rest.entities.Quiz;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring", uses = QuestionMapper.class)
public interface QuizMapper {

    Quiz requestDtoToEntity(QuizRequestDto quizRequestDto);

    QuizResponseDto entityToResponseDto(Quiz quiz);

    List<QuizResponseDto> entityToResponseDto(List<Quiz> quizzes);
}