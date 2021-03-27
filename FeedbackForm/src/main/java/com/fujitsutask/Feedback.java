package com.fujitsutask;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Feedback {
    private Long id;
    private String name;
    private String email;
    private String text;
    private String category;

    protected Feedback() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "Name is mandatory")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "Email is mandatory")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotBlank(message = "Please fill out this form")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @NotBlank(message = "You must choose a category")
    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

}
