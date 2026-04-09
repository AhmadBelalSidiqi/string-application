package com.pluralsight;

import com.sun.security.jgss.GSSUtil;

public class Reciept {
    public static void main(String[] args) {
        System.out.println();
        // Step 3
        String itemName;
        double itemPrice;
        int quantity;

        itemName = "Milk";
        itemPrice = 2.69;
        quantity =3;

        System.out.println("You bought " + quantity +" " + itemName+" for (" + itemPrice +") total is : " + itemPrice*quantity);


    }
}
