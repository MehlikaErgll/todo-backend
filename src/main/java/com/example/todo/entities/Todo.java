package com.example.todo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="todos") 
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(length = 200, nullable = false)
    private String title;

    @Column(length = 600)
    private String description;

    @Column(length = 20)
    private String status = "new";

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @Column(name="deleted_at")
    private Boolean deletedAt = false;

    public Todo() {}

    public Long getId() {return id;}
    public void setId(Long id) {
        this.id = id;}

    public User getUser() { return user;}
    public void setUser(User user) {
        this.user = user;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { 
        this.status = status; }

    public LocalDateTime getDueDate() { return dueDate; }
    public void setDueDate(LocalDateTime dueDate) { 
        this.dueDate = dueDate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { 
        this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { 
        this.updatedAt = updatedAt; }

    public Boolean getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Boolean deletedAt) { 
        this.deletedAt = deletedAt; }
}
    

