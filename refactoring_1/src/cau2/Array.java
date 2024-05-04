package cau2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] soNguyen = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            soNguyen[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi đảo ngược: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");

        for (int i = 0; i < n / 2; i++) {
            int empty;
            empty = soNguyen[i];
            soNguyen[i] = soNguyen[n - i - 1];
            soNguyen[n - i - 1] = empty;
        }

        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");
    }
}
