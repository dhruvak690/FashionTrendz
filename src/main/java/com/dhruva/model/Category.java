package com.dhruva.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(max=50)
    private String name;
    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category category;

    private int level;

    public Category() {
    }

    public Category(Long id, String name, Category category, int level) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.level = level;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
