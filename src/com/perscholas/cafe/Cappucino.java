package com.perscholas.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Cappucino extends Product{

    boolean peppermint = false;
    boolean whippedCream = false;

    public Cappucino(String name, double price, String description) {
        super(name, price, description);
//        this.peppermint = peppermint;
//        this.whippedCream = whippedCream;
    }

    @Override
    public void addOptions() {
        Scanner ps = new Scanner(System.in);
        String p = ps.next();
        if (p.equals("mintandcream")) {
            peppermint = true;
            whippedCream = true;

//            ps.close();
        } else if (p.equals("peppermint")){
            peppermint = true;
//            ps.close();
        }else if (p.equals("whippedcream")){
            whippedCream = true;
//            ps.close();
        }
    }

    @Override
    public void printOptions() {
        System.out.println("Would you like peppermint and whippedcream with your coffee? If you do type \"peppermint\", \"whippedcream\", or \"mintandcream\" respectively"
        );
    }

    @Override
    public void calculateProductTotal() {
        double subTot = price*quantity;
        if (peppermint == true){
            subTot = subTot + 2.00;
        }
        if (whippedCream == true){
            subTot = subTot + 1.00;
        }
        setSubTotal(subTot);
        BigDecimal sTotal = new BigDecimal(subTot).setScale(2, RoundingMode.HALF_UP);
        System.out.println(name+": "+description+" Qty:  "+quantity+" Peppermint: "+peppermint+" Whipped Cream: "+whippedCream+" Subtotal: "+sTotal);
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }
}
