package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: \n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
            for (int i = 1; i <= n; i=i+2) {
                sum = sum + i;
            }
            System.out.println(sum);
    }
}

