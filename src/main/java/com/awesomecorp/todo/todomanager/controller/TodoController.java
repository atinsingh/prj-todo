package com.awesomecorp.todo.todomanager.controller;

import com.awesomecorp.todo.todomanager.entity.Todo;
import com.awesomecorp.todo.todomanager.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    /*
        Rest API
        GET
        POST
        PUT
        DELETE

     */
    @PostMapping("/api/todo")
    public Todo create(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

}
