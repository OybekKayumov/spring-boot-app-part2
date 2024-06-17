package com.example.spring.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter
@Setter
public class News {

    private final Long id;
    private final String title;
    private final String text;
    private Instant date;

    public boolean isValid() {
        return title != null || text != null || date != null;
    }
}
