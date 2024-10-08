package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;

@Entity
public class Book {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String author;
    private String price;

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getAuthor() {
        return this.author;
    }

    @Generated
    public String getPrice() {
        return this.price;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setName(final String name) {
        this.name = name;
    }

    @Generated
    public void setAuthor(final String author) {
        this.author = author;
    }

    @Generated
    public void setPrice(final String price) {
        this.price = price;
    }

    @Generated
    public Book() {
    }

    @Generated
    public Book(final Long id, final String name, final String author, final String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
