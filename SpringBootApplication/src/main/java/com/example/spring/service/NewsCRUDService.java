package com.example.spring.service;

import com.example.spring.dto.NewsDto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NewsCRUDService implements CRUDService<NewsDto> {

    private final ConcurrentHashMap<Long, NewsDto> newsCollection =
            new ConcurrentHashMap<>();
    private AtomicLong currentId = new AtomicLong(0);

    @Override
    public NewsDto getById(Long id) {
        System.out.println("Get News ID: " + id);
        return newsCollection.get(id);
    }

    @Override
    public Collection<NewsDto> getAll() {
        System.out.println("Get All News...");
        return newsCollection.values();
    }

    @Override
    public void create(NewsDto item) {
        System.out.println("Create News...");
        Long newId = currentId.incrementAndGet();
        item.setId(newId);
        newsCollection.put(newId, item);
    }

    @Override
    public void update(Long id, NewsDto item) {
        System.out.println("Update News ID: " + id);
        if (!newsCollection.containsKey(id)) return;
        item.setId(id);
        newsCollection.put(id, item);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("Delete News ID: " + id);
        newsCollection.remove(id);
    }

    public boolean containsId(Long id) {
        return newsCollection.containsKey(id);
    }
}
