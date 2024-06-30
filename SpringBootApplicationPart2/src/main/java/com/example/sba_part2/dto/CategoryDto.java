package com.example.sba_part2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CategoryDto {

    private Long id;
    private final String category;
    private List<NewsDto> newsDto;
}
