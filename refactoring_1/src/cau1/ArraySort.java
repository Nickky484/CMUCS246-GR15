package cau1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự tăng dần");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        Arrays.sort(arr);
        System.out.println("Dãy số được sắp xếp tăng dần:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
