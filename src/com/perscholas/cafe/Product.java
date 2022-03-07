package com.perscholas.cafe;
import java.math.BigDecimal;
import java.math.RoundingMode;

abstract public class Product {
    String name;
    double price;
    String description;
    int quantity;
    double subTotal;

    public Product(){};

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    abstract public void calculateProductTotal();
    abstract public void addOptions();
    abstract public void printOptions();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
