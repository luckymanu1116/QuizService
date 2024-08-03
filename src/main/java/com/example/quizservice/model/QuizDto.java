package com.example.quizservice.model;

import lombok.Data;

@Data
public class QuizDto {
    Integer numQuestions;
    String categoryName;
    String title;

}
