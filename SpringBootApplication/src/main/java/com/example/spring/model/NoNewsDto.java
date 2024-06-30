package com.example.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoNewsDto {

    private String message;

    public NoNewsDto(Long id) {
        message = "Новость с ID " + id + " не найдена.";
    }
}