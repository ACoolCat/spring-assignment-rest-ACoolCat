package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.AnswerRequestDto;
import com.cooksys.rest.entities.Answer;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AnswerMapper {


    AnswerRequestDto entityToDto(Answer answer);
    Answer dtoToEntity(AnswerRequestDto answerRequestDto);
}