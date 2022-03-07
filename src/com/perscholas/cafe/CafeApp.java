package com.perscholas.cafe;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Scanner;

public class CafeApp {


    public static void main(String[] args) {
        printMenu();
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        ShoppingCart shop = new ShoppingCart();
        menuOrder(order, shop);

//        Answer to Project 1 and 2
        //        Product coffee = new Coffee("coffee", 3.00, "black liquid", true, false);
//        Product espresso = new Espresso("espresso", 4.00, "shot of caffeine", true, false );
//        Product cappuccino = new Cappucino("cappuccino", 5.00, "caramel and coffee", false, true);
//        Scanner s = new Scanner(System.in);
//        System.out.println("How many coffees do you want?  ");
//        int coffeeQt = s.nextInt();
//        coffee.setQuantity(coffeeQt);
//        coffee.calculateProductTotal();
//        System.out.println("How many espressos do you want?  ");
//        int espQt = s.nextInt();
//        espresso.setQuantity(espQt);
//        espresso.calculateProductTotal();
//        System.out.println("How many cappucinos do you want?  ");
//        int capQt = s.nextInt();
//        cappuccino.setQuantity(capQt);
//        cappuccino.calculateProductTotal();
//        double coffeeTotal = coffee.getSubTotal();
//        double espressoTotal = espresso.getSubTotal();
//        double capTotal = cappuccino.getSubTotal();
//        completeOrder(coffeeTotal, espressoTotal, capTotal);



    }
    public static void printMenu(){
        System.out.println("Please Select from the following menu: ");
        System.out.println("1: Coffee");
        System.out.println("2: Cappuccino");
        System.out.println("3: Espresso");
        System.out.println("4: Checkout");
        System.out.println("5: Reprint Menu");
    }
    public static void menuOrder(int order, ShoppingCart shop){
        Scanner os = new Scanner(System.in);
        if (order == 1){
            Product coffee = new Coffee("coffee", 3.00, "black liquid");
            System.out.println("How many coffees do you want?  ");
            int qty = os.nextInt();
            coffee.setQuantity(qty);
            shop.setCoffeeQty(qty);
            coffee.printOptions();
            coffee.addOptions();
            coffee.calculateProductTotal();
            shop.setCoffeeTotal(coffee.subTotal);
            System.out.println("\n");
            int nextOrder = os.nextInt();
            menuOrder(nextOrder, shop);
        } else if (order == 2){
            Product cappucino = new Cappucino("cappucino", 5.00, "caramel and coffee");
            System.out.println("How many Cappuccinos do you want? ");
            int qty = os.nextInt();
            cappucino.setQuantity(qty);
            shop.setCapQty(qty);
            cappucino.printOptions();
            cappucino.addOptions();
            cappucino.calculateProductTotal();
            shop.setCapTotal(cappucino.subTotal);
            int nextOrder = os.nextInt();
            menuOrder(nextOrder, shop);
        } else if (order==3){
            Product espresso = new Espresso("espresso", 4.00, "shot of caffeine");
            System.out.println("How many Espressos do you want? ");
            int qty = os.nextInt();
            espresso.setQuantity(qty);
            shop.setEspQty(qty);
            espresso.printOptions();
            espresso.addOptions();
            espresso.calculateProductTotal();
            shop.setEspTotal(espresso.subTotal);
            int nextOrder = os.nextInt();
            menuOrder(nextOrder, shop);
        }else if (order == 4){
            shop.calculateTotal();
        }else if (order == 5){
            printMenu();
            int nextOrder = os.nextInt();
            menuOrder(nextOrder, shop);
        }
    }
    public static void completeOrder(double coffeeTotal, double espressoTotal, double capTotal){
        double orderTotal = coffeeTotal + espressoTotal + capTotal;
        BigDecimal sTotal = new BigDecimal(orderTotal).setScale(2, RoundingMode.HALF_UP);
        double salesTax = .15 * orderTotal;
        BigDecimal sTax = new BigDecimal(salesTax).setScale(2, RoundingMode.HALF_UP);
        double salesTotal = orderTotal + salesTax;
        BigDecimal total = new BigDecimal(salesTotal).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The total for your order is $"+sTotal+". Plus a sales tax of $"+sTax+
                " which comes out to $"+total);
    }

}
