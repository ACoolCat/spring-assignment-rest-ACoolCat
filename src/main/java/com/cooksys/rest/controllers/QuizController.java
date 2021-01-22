package com.cooksys.rest.controllers;

import com.cooksys.rest.dtos.QuizRequestDto;
import com.cooksys.rest.dtos.QuizResponseDto;
import com.cooksys.rest.services.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "menu")
public class QuizController {

    private MenuService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("")
    public ResponseEntity<QuizResponseDto> createQuiz(@RequestBody QuizRequestDto quizRequestDto){
        return quizService.createMenu(quizRequestDto);
    }
}
