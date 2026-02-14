package com.example.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.todo.repository.TodoRepository;
import com.example.todo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

import com.example.todo.dto.TodoCreateRequest;
import com.example.todo.dto.TodoResponse;
import com.example.todo.entities.Todo;
import com.example.todo.entities.User;

@RequiredArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository; 
    private final UserRepository userRepository;

    public List<Todo> getAllTodos() {
       return todoRepository.findAll();
    }
    
    public TodoResponse createTodo(TodoCreateRequest request) {
        
        User user = userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));

        Todo todo = new Todo();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        todo.setStatus(request.getStatus());
        todo.setUser(user);
    
        Todo saved = todoRepository.save(todo);

        // DTO üzerinden return etmek, entitiy yi dünyaya açmamak anlamına gelir, API response u kontrol altında tutulmuş olur.
        return new TodoResponse(
            saved.getId(),
            saved.getTitle(),
            saved.getDescription(),
            saved.getStatus());
    }
}
