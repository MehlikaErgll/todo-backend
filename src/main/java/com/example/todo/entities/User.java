package com.example.todo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 60, nullable = false, unique = true)
    private String email;

    @Column(length = 255)
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private Boolean deletedAt = false;


    public User() {}

        public Long getId() { return id;}
        public void setId(Long id) { this.id = id;}

        public String getName() { return name;}
        public void setName(String name) {this.name = name;}

        public String getEmail() {return email;}
        public void setEmail(String email) {this.email = email;}

        public String getPassword() {return password;}
        public void setPassword(String password) {this.password = password;}

        public LocalDateTime getCreatedAt() { return createdAt;}
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt;}

        public LocalDateTime getUpdatedAt() { return updatedAt;}
        public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt;}

        public Boolean getDeletedAt() { return deletedAt;}
        public void setDeletedAt(Boolean deletedAt) { this.deletedAt = deletedAt;}
    }





