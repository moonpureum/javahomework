package com.example.demo.homework;
import java.util.Scanner;

public class Week1Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 0, b = 0, i = 0, j = 0, min;
        int[] arr = new int[30];

        n = sc.nextInt();

        while(a < n) {
            arr[a] = sc.nextInt();
            a++;
        }

        while(i < n) {
            j = i+1;
            while(j < n) {
                if(arr[i] > arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                    j++;
                } else {
                    j++;
                }

            }
            i++;
        }

        System.out.printf("\n");

        while(b < n) {
            System.out.println(arr[b]);
            b++;
        }
    }
}
