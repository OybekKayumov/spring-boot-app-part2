package com.example.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter
@Setter
public class NewsDto {

    private long id;
    private final String title;
    private final String text;
    private Instant date = Instant.now();

}
