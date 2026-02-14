package com.example.todo.controller;

import java.util.List;

import com.example.todo.dto.TodoCreateRequest;
import com.example.todo.dto.TodoResponse;
import com.example.todo.entities.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.service.TodoService;;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController (TodoService todoService){
        this.todoService = todoService;
    } 

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    } 

    @PostMapping
    public TodoResponse createTodo( @RequestBody TodoCreateRequest request) {
        return todoService.createTodo(request);
    }
}