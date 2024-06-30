package com.example.sba_part2.controller;

import com.example.sba_part2.dto.NewsDto;
import com.example.sba_part2.dto.NoNewsDto;
import com.example.sba_part2.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/{id}")
    public ResponseEntity getNewsById(@PathVariable Long id) {
        if (!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(newsService.findNewsById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllNews() {
        return new ResponseEntity(newsService.getAllNews(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNews(@RequestBody NewsDto newsDto) {
        if (newsDto == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        newsService.createNews(newsDto);
        return new ResponseEntity(newsDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateNews(@PathVariable Long id,
                                    @RequestBody NewsDto newsDto) {
        if (!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id), HttpStatus.NOT_FOUND);
        } else if (newsDto == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        newsDto.setId(id);
        newsService.updateNews(newsDto);
        return new ResponseEntity(newsDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNewsById(@PathVariable Long id) {
        if(!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id), HttpStatus.NOT_FOUND);
        }
        newsService.deleteNewsById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
