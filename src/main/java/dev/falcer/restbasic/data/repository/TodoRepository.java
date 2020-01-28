package dev.falcer.restbasic.data.repository;

import dev.falcer.restbasic.data.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
