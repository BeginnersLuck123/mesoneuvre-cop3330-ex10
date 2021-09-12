package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //Scanning in input for items and quantities, then turning them into numerical data
        System.out.println("Enter the price of item 1: ");
        String item1 = input.nextLine();
        int item1Num = Integer.parseInt(item1);
        System.out.println("Enter the quantity of item 1: ");
        String quantity1 = input.nextLine();
        int quantity1Num = Integer.parseInt(quantity1);
        System.out.println("Enter the price of item 2: ");
        String item2 = input.nextLine();
        int item2Num = Integer.parseInt(item2);
        System.out.println("Enter the quantity of item 2: ");
        String quantity2 = input.nextLine();
        int quantity2Num = Integer.parseInt(quantity2);
        System.out.println("Enter the price of item 3: ");
        String item3 = input.nextLine();
        int item3Num = Integer.parseInt(item3);
        System.out.println("Enter the quantity of item 3: ");
        String quantity3 = input.nextLine();
        int quantity3Num = Integer.parseInt(quantity3);
        //Calculating the subtotal, tax, and complete total
        double subtotal = (item1Num*quantity1Num) + (item2Num*quantity2Num) + (item3Num*quantity3Num);
        double tax = subtotal * .055;
        double total = subtotal + tax;
        String concat = ("Subtotal: " + subtotal + "\n" + "Tax: " + tax + "\n" + "Total: " + total);//String Concatenation
        System.out.println(concat);//Output
    }
}
