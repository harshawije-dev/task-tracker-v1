package com.example.tasktracker.core.entitiy;

import jakarta.persistence.*;

@Entity
class Task {
    private @Id @GeneratedValue Long id;
    private String title;
    private String note;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "column_id", referencedColumnName = "id")
    private Category category;
    private boolean isCompleted = false;
    private boolean isPinned = false;

    private Task() {}

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
