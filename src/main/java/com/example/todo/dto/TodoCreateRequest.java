package com.example.todo.dto;

import lombok.Data;

@Data
public class TodoCreateRequest {

    private String title;
    private String description;
    private String status;
    private Long userId;
    
}

//Data; getter,setter, toString(), equals(), hashCode() üretir.

