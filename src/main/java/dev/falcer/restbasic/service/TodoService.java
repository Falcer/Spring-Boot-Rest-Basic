package dev.falcer.restbasic.service;

import dev.falcer.restbasic.data.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAll();
    Todo getById(Long id);
    Todo create(Todo todo);
    Todo update(Todo todo);
    boolean delete(Long id);
}
