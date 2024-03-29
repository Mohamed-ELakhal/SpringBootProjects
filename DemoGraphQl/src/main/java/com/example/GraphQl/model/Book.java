package com.example.GraphQl.model;

import com.example.GraphQl.constant.Category;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("books")
public class Book {

    @Id
    private UUID id;
    private String name;
    private int pages;
    private Category category;

    public Book() { }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}