package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}
