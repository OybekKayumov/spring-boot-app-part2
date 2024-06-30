package com.example.sba_part2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoCategoryDto {

    private String message;

    public NoCategoryDto(Long id) {
        message = "Категория с ID " + id + " не найдена";
    }
}
