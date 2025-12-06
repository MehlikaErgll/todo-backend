package com.example.todo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reminders")
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "todo_id", nullable = false)
    private Todo todo;

    @Column(name = "remind_at")
    private LocalDateTime remindAt;

    private Boolean sent = false;

    @Column(name = "deleted_at")
    private Boolean deletedAt = false;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public Reminder() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Todo getTodo() { return todo; }
    public void setTodo(Todo todo) { this.todo = todo; }

    public LocalDateTime getRemindAt() { return remindAt; }
    public void setRemindAt(LocalDateTime remindAt) { this.remindAt = remindAt; }

    public Boolean getSent() { return sent; }
    public void setSent(Boolean sent) { this.sent = sent; }

    public Boolean getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Boolean deletedAt) { this.deletedAt = deletedAt; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
