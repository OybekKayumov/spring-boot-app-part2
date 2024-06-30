package com.example.sba_part2.service;

import com.example.sba_part2.converter.NewsConverter;
import com.example.sba_part2.dto.NewsDto;
import com.example.sba_part2.entity.News;
import com.example.sba_part2.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;
    private final NewsConverter newsConverter;

    public NewsDto findNewsById(Long id) {
        News news = newsRepository.findById(id).orElseThrow();
        return newsConverter.mapToNewsDto(news);
    }

    public Collection<NewsDto> getAllNews() {
        return newsRepository.findAll()
                .stream()
                .map(newsConverter::mapToNewsDto)
                .collect(Collectors.toList());
    }

    public void createNews(NewsDto newsDto) {
        News news = newsConverter.mapToNewsEntity(newsDto);
        newsRepository.save(news);
    }

    public void updateNews(NewsDto newsDto) {
        News news = newsConverter.mapToNewsEntity(newsDto);
        newsRepository.save(news);
    }

    public void deleteNewsById(Long id) {
        newsRepository.deleteById(id);
    }

    public boolean containsId(Long id) {
        return newsRepository.existsById(id);
    }
}
