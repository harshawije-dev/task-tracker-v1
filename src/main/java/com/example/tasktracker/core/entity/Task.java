package com.example.tasktracker.core.entity;

import jakarta.persistence.*;

@Entity
public class Task {
    private @Id @GeneratedValue Long id;
    private String title;
    private String note;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    private Category category;
    private boolean isCompleted = false;
    private boolean isPinned = false;


    protected Task() {}

    Task(String title, String note, Category category) {
        this.title = title;
        this.note = note;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Category getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isCompleted(boolean complete) {
        this.isCompleted = complete;
        return isCompleted;
    }

    public boolean isPinned(boolean pinned) {
        this.isPinned = pinned;
        return isPinned;
    }
}
