package com.soa.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idProduct;
    private String lib;
    private String price;
    private String qte;

    @ManyToOne
    @JoinColumn(name= "idCategory")
    private Category category;


    @Override
    public String toString() {
        return "product{" +
                "id_produit=" + idProduct +
                ", lib='" + lib + '\'' +
                ", prix='" + price + '\'' +
                ", qte='" + qte + '\'' +
                ", categorie=" + category +
                '}';
    }

    public Product(String lib, String price, String qte, Category cat) {
        this.lib = lib;
        this.price = price;
        this.qte = qte;
        this.category = cat;
    }

    public Product() { }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int id_product) {
        this.idProduct = id_product;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String prix) {
        this.price = prix;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category cat) {
        this.category = cat;
    }
}
