package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.QuestionRequestDto;
import com.cooksys.rest.dtos.QuestionResponseDto;
import com.cooksys.rest.entities.Question;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses = AnswerMapper.class)
public interface QuestionMapper {

    Question requestDtoToEntity(QuestionRequestDto questionRequestDto);

    QuestionResponseDto entityToResponseDto(Question question);
}