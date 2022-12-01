package com.h2;

import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.5f,
            2, 3.45f,
            3, 2.67f
    );

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
        int loanTermInYear = scanner.nextInt();

    }

    public static float getRates()
}
