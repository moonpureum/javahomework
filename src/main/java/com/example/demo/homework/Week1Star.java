package com.example.demo.homework;
import java.util.Scanner;

public class Week1Star {
    public static void main(String[] args) {
        int s;
        int i, j, m, n, a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();

        while (a < s) {
            i = 0;
            j = 0;
            m = 0;
            n = 0;
            while (i <= a) {
                System.out.printf("*");
                i++;
            }
            while (j < s-a-1) {
                System.out.printf(" ");
                j++;
            }
            while (m < s-a-1) {
                System.out.printf(" ");
                m++;
            }
            while (n <= a) {
                System.out.printf("*");
                n++;
            }
            System.out.printf("\n");
            a++;
        }

        while (b < s-1) {
            i = 0;
            j = 0;
            m = 0;
            n = 0;
            while (i < s-b-1) {
                System.out.printf("*");
                i++;
            }
            while (j <= b) {
                System.out.printf(" ");
                j++;
            }
            while (m <= b) {
                System.out.printf(" ");
                m++;
            }
            while (n < s-b-1) {
                System.out.printf("*");
                n++;
            }
            System.out.printf("\n");
            b++;
        }

    }
}
