package dev.falcer.restbasic.service.impl;

import dev.falcer.restbasic.data.entity.Todo;
import dev.falcer.restbasic.data.repository.TodoRepository;
import dev.falcer.restbasic.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public boolean delete(Long id) {
        Todo result = todoRepository.findById(id).orElse(null);
        if (result != null) {
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
