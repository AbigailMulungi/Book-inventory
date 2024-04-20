package com.abigail.examcs.controllers;

import jakarta.validation.constraints.NotBlank;
public class CategoryController {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
