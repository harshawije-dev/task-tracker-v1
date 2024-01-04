package com.example.tasktracker.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Category {
    private @Id
    @GeneratedValue Long id;
    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
