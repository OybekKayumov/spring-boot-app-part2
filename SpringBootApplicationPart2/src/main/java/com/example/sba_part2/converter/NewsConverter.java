package com.example.sba_part2.converter;

import com.example.sba_part2.dto.NewsDto;
import com.example.sba_part2.entity.Category;
import com.example.sba_part2.entity.News;
import com.example.sba_part2.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class NewsConverter {

    private final CategoryRepository categoryRepository;

    public NewsDto mapToNewsDto(News news) {
        Long id = news.getId();
        Long categoryId = news.getCategory().getId();
        String title = news.getTitle();
        String text = news.getText();
        return new NewsDto(id, categoryId, title, text);
    }

    public News mapToNewsEntity(NewsDto newsDto) {
        Long id = newsDto.getId();
        Long categoryId = newsDto.getCategoryId();
        Category category =
                categoryRepository.findById(categoryId).orElseThrow();
        String title = newsDto.getTitle();
        String text = newsDto.getText();
        return new News(id, category, title, text, Instant.now());
    }
}
