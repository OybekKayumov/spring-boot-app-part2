package com.example.sba_part2.converter;

import com.example.sba_part2.dto.CategoryDto;
import com.example.sba_part2.dto.NewsDto;
import com.example.sba_part2.entity.Category;
import com.example.sba_part2.entity.News;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryConverter {

    private final NewsConverter newsConverter;

    public CategoryDto mapToCategoryDto(Category category) {
        Long id = category.getId();
        String categ = category.getCategory();
        List<NewsDto> newsDto = category.getNews()
                .stream()
                .map(newsConverter::mapToNewsDto)
                .toList();
        return new CategoryDto(id, categ, newsDto);
    }

    public Category mapToCategory(CategoryDto categoryDto) {
        Long id = categoryDto.getId();
        String category = categoryDto.getCategory();
        List<News> news = categoryDto.getNewsDto()
                .stream()
                .map(newsConverter::mapToNewsEntity)
                .toList();
        return new Category(id, category, news);
    }
}
