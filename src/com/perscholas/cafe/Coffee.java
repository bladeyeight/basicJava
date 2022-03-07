package com.perscholas.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Coffee extends Product{


    boolean sugar;
    boolean milk;

    public Coffee(String name, double price, String description) {
        super(name, price, description);
//        this.sugar = sugar;
//        this.milk = milk;
    }

    public Coffee(){
        super("Coffee", 3.00, "black liquid");
//        this.sugar = false;
//        this.milk = false;
    }

    @Override
    public void addOptions() {
        Scanner ps = new Scanner(System.in);
        String p = ps.next();
        if (p.equals("milkandsugar")) {
            milk = true;
            sugar = true;

//            ps.close();
        } else if (p.equals("milk")){
            milk = true;
//            ps.close();
        }else if (p.equals("sugar")){
            sugar = true;
//            ps.close();
        }


    }

    @Override
    public void printOptions() {
        System.out.println("Would you like milk and sugar with your coffee? If you do type \"milk\", \"sugar\", or \"milkandsugar\" respectively"
                );
    }

    @Override
    public void calculateProductTotal() {
        double subTot = price*quantity;
        if (milk == true){
            subTot = subTot + 2.00;
        }
        if (sugar == true){
            subTot = subTot + 1.00;
        }
        setSubTotal(subTot);
        BigDecimal sTotal = new BigDecimal(subTot).setScale(2, RoundingMode.HALF_UP);
        System.out.println(name+": "+description+" Qty:  "+quantity+" Milk: "+milk+" Sugar: "+sugar+" Subtotal: "+sTotal);
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
