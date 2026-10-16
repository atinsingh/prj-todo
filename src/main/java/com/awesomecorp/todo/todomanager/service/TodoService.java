package com.awesomecorp.todo.todomanager.service;

import com.awesomecorp.todo.todomanager.entity.Todo;
import com.awesomecorp.todo.todomanager.entity.TodoStatus;
import com.awesomecorp.todo.todomanager.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Date;
/*
    Todo - Explain different type of injections
 */

@Service
public class TodoService {
    private final TodoRepository  todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    // Create
    public Todo createTodo(Todo todo) {
        if (null == todo || todo.getTitle() == null || todo.getDescription() == null) {
            throw new RuntimeException("Todo, title, description cannot be null ");
        }
        todo.setStatus(TodoStatus.NEW);
        todo.setCreatedAt(new Date());
        todo.setDueDate(Date.from(Instant.now().plusSeconds(350000)));
        return todoRepository.save(todo); // Hibernate
    }
}
