package org.demo.java101;

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();


        double vatRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        double vatAmount = amount * vatRate;
        double priceWithVat = amount + vatAmount;

        System.out.println("Amount without VAT: " + amount);
        System.out.println("VAT Rate: " + (vatRate * 100) + "%");
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Price with VAT: " + priceWithVat);

        scanner.close();
    }
}
