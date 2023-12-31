package com.soa.back.model;

import jakarta.persistence.*;

import java.util.Set;

    @Entity
    @Table(name = "category")
    public class Category {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="id")
        private int idCategory;
        private String name;

        @Override
    public String toString() {
        return "Category{" +
                "id_category=" + idCategory +
                ", name='" + name + '\'' +
                '}';
    }

    public Category(String name) {
        this.name = name;
    }
    public Category() {}
    public int getId_category() {
        return idCategory;
    }
    public void setId_category(int id_category) {
        this.idCategory = id_category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}