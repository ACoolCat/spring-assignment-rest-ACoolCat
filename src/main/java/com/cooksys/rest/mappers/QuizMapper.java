package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.QuizRequestDto;
import com.cooksys.rest.dtos.QuizResponseDto;
import com.cooksys.rest.entities.Quiz;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses = ItemMapper.class)
public interface QuizMapper {

    Quiz requestDtoToEntity(QuizRequestDto quizRequestDto);

    QuizResponseDto entityToResponseDto(Quiz quiz);
}