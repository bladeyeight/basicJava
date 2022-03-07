package com.perscholas.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Espresso extends Product{
    boolean  extraShot= false;
    boolean macchiato = false;



    public Espresso(String name, double price, String description) {
        super(name, price, description);
//        this.extraShot = extraShot;
//        this.macchiato = macchiato;
    }

    @Override
    public void addOptions() {
        Scanner ps = new Scanner(System.in);
        String p = ps.next();
        if (p.equals("macchiatoshot")) {
            macchiato = true;
            extraShot = true;

//            ps.close();
        } else if (p.equals("macchiato")){
            macchiato = true;
//            ps.close();
        }else if (p.equals("shot")){
            extraShot = true;
//            ps.close();
        }
    }

    @Override
    public void printOptions() {
        System.out.println("Would you like an extra shot or a macchiato? If you do type \"shot\", \"macchiato\", or \"macchiatoshot\" respectively"
        );
    }

    @Override
    public void calculateProductTotal() {
        double subTot = price*quantity;
        if (extraShot == true){
            subTot = subTot + 2.00;
        }
        if (macchiato == true){
            subTot = subTot + 1.00;
        }
        setSubTotal(subTot);
        BigDecimal sTotal = new BigDecimal(subTot).setScale(2, RoundingMode.HALF_UP);
        System.out.println(name+": "+description+" Qty:  "+quantity+" Macchiato: "+macchiato+" Extra Shot: "+extraShot+" Subtotal: "+sTotal);
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }
}
