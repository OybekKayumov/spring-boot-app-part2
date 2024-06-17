package com.example.spring.controller;

import com.example.spring.dto.NewsDto;
import com.example.spring.model.NoNewsDto;
import com.example.spring.service.NewsCRUDService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/news")
@AllArgsConstructor
public class NewsController {

    private final NewsCRUDService newsService = new NewsCRUDService();

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        if (!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(newsService.getById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAll() {
        return new ResponseEntity(newsService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody NewsDto item) {
        if (item == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        newsService.create(item);
        return new ResponseEntity(item, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id,
                                 @RequestBody NewsDto item) {
        if (!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id),
                    HttpStatus.NOT_FOUND);
        } else if (item == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        newsService.update(id, item);
        return new ResponseEntity(item, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        if (!newsService.containsId(id)) {
            return new ResponseEntity(new NoNewsDto(id), HttpStatus.NOT_FOUND);
        }

        newsService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
