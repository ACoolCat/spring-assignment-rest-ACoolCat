package com.cooksys.rest.controllers;

import com.cooksys.rest.dtos.QuizRequestDto;
import com.cooksys.rest.dtos.QuizResponseDto;
import com.cooksys.rest.services.QuizService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public ResponseEntity<List<QuizResponseDto>> getAllQuizzes(){
        return quizService.getAllQuizzes();
    }

    @PostMapping("")
    public ResponseEntity<QuizResponseDto> createQuiz(@RequestBody QuizRequestDto quizRequestDto){
        return quizService.createQuiz(quizRequestDto);
    }

    @DeleteMapping("/{id}")
    public QuizResponseDto deleteQuiz(@PathVariable Long id) throws NotFoundException {
        return quizService.deleteQuiz(id);
    }




}
