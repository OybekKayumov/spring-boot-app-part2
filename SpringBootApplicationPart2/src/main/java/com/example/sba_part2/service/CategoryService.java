package com.example.sba_part2.service;

import com.example.sba_part2.converter.CategoryConverter;
import com.example.sba_part2.dto.CategoryDto;
import com.example.sba_part2.entity.Category;
import com.example.sba_part2.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryConverter categoryConverter;

    public CategoryDto findCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        return categoryConverter.mapToCategoryDto(category);
    }

    public Collection<CategoryDto> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryConverter::mapToCategoryDto)
                .collect(Collectors.toList());
    }

    public void createNewCategory(CategoryDto categoryDto) {
        Category category = categoryConverter.mapToCategory(categoryDto);
        categoryRepository.save(category);
    }

    public void updateCategory(CategoryDto categoryDto) {
        Category category = categoryConverter.mapToCategory(categoryDto);
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    public boolean containsId(Long id) {
        return categoryRepository.existsById(id);
    }
}
