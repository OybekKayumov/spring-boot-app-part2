package com.example.sba_part2.controller;


import com.example.sba_part2.dto.CategoryDto;
import com.example.sba_part2.dto.NoCategoryDto;
import com.example.sba_part2.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity getCategoryById(@PathVariable Long id) {
        if (!categoryService.containsId(id)) {
            return new ResponseEntity(new NoCategoryDto(id),
                    HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(categoryService.findCategoryById(id),
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCategory() {
        return new ResponseEntity(categoryService.getAllCategories(),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCategory(@RequestBody CategoryDto categoryDto) {
        if (categoryDto == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        categoryService.createNewCategory(categoryDto);
        return new ResponseEntity(categoryDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCategory(@PathVariable Long id,
                                         @RequestBody CategoryDto categoryDto) {
        if (!categoryService.containsId(id)) {
            return new ResponseEntity(new NoCategoryDto(id),
                    HttpStatus.NOT_FOUND);
        } else if (categoryDto == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        categoryDto.setId(id);
        categoryService.updateCategory(categoryDto);
        return new ResponseEntity(categoryDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCategoryById(@PathVariable Long id) {
        if (!categoryService.containsId(id)) {
            return new ResponseEntity(new NoCategoryDto(id),
                    HttpStatus.NOT_FOUND);
        }

        categoryService.deleteCategory(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
