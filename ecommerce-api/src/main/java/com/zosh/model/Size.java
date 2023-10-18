package com.zosh.model;

public class Size {

    private String name;
    private int quantity;

    public Size() {
    }

    public String getName() {
        return name;
    }

    public Size(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
