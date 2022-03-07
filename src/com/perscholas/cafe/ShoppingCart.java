package com.perscholas.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingCart {
    double coffeeTotal;
    double capTotal;
    double espTotal;
    int coffeeQty;
    int capQty;
    int espQty;

    public void calculateTotal(){
        double orderTotal = coffeeTotal + espTotal + capTotal;
        BigDecimal sTotal = new BigDecimal(orderTotal).setScale(2, RoundingMode.HALF_UP);
        double salesTax = .15 * orderTotal;
        BigDecimal sTax = new BigDecimal(salesTax).setScale(2, RoundingMode.HALF_UP);
        double salesTotal = orderTotal + salesTax;
        BigDecimal total = new BigDecimal(salesTotal).setScale(2, RoundingMode.HALF_UP);
        if (coffeeQty > 0){
            System.out.println("Item: Coffee     Price: $3.00     Qty: "+coffeeQty+"     Subtotal: "+coffeeTotal);
        }
        if(espQty > 0){
            System.out.println("Item: Espresso     Price: $4.00     Qty: "+espQty+"     Subtotal: "+espTotal);
        }
        if (capQty > 0){
            System.out.println("Item: Cappuccino     Price: $5.00     Qty: "+capQty+"     Subtotal: "+capTotal);
        }
        System.out.println("Purchase Subtotal: "+sTotal);
        System.out.println("Sales Tax: "+sTax);
        System.out.println("Purchase Total: "+total);
    }

    public int getCoffeeQty() {
        return coffeeQty;
    }

    public void setCoffeeQty(int coffeeQty) {
        this.coffeeQty = coffeeQty;
    }

    public int getCapQty() {
        return capQty;
    }

    public void setCapQty(int capQty) {
        this.capQty = capQty;
    }

    public int getEspQty() {
        return espQty;
    }

    public void setEspQty(int espQty) {
        this.espQty = espQty;
    }

    public double getCoffeeTotal() {
        return coffeeTotal;
    }

    public void setCoffeeTotal(double coffeeTotal) {
        this.coffeeTotal = coffeeTotal;
    }

    public double getCapTotal() {
        return capTotal;
    }

    public void setCapTotal(double capTotal) {
        this.capTotal = capTotal;
    }

    public double getEspTotal() {
        return espTotal;
    }

    public void setEspTotal(double espTotal) {
        this.espTotal = espTotal;
    }


}
