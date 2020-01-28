package dev.falcer.restbasic.controller;

import dev.falcer.restbasic.data.entity.Todo;
import dev.falcer.restbasic.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    TodoService todoService; // null

    @GetMapping("/")
    List<Todo> getAll() {
        return todoService.getAll();
    }

    @PostMapping("/")
    Todo create(@RequestBody Todo todo) {
            return todoService.create(todo);
    }

    @PutMapping("/")
    Todo update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    boolean delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
