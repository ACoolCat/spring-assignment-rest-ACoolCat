package com.cooksys.rest.services;

import com.cooksys.rest.dtos.QuizRequestDto;
import com.cooksys.rest.dtos.QuizResponseDto;
import com.cooksys.rest.entities.*;
import com.cooksys.rest.mappers.QuizMapper;
import com.cooksys.rest.repository.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizService {

    private QuizRepository quizRepository;
    private QuizMapper quizMapper;

    public ResponseEntity<List<QuizResponseDto>> getAllQuizzes(){
        List<Quiz> quizzesList = quizRepository.findAll();
        return new ResponseEntity<List<QuizResponseDto>>(quizMapper.entityToResponseDto(quizzesList), HttpStatus.OK);
    }

    public ResponseEntity<QuizResponseDto> createQuiz(QuizRequestDto quizRequestDto) {
        Quiz quiz = quizMapper.requestDtoToEntity(quizRequestDto);

        for(Question question : quiz.getQuestions()) {
            question.setQuiz(quiz);
            for(Answer answer : question.getAnswers()){
                answer.setQuestion(question);
            }
        }


        Quiz savedQuiz = quizRepository.saveAndFlush(quiz);
        return new ResponseEntity<>(quizMapper.entityToResponseDto(savedQuiz), HttpStatus.CREATED);
    }
}
