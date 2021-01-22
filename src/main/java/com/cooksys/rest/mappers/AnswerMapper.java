package com.cooksys.rest.mappers;

import com.cooksys.rest.dtos.AnswerRequestDto;
import com.cooksys.rest.dtos.AnswerResponseDto;
import com.cooksys.rest.entities.Answer;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring", uses = AnswerMapper.class)
public interface AnswerMapper {

    Answer requestDtoToEntity(AnswerRequestDto answerRequestDto);

    AnswerResponseDto entityToResponseDto(Answer Answer);
}