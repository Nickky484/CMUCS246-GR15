package cau3;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        quadratic(a, b, c);
        linear(a, b);
        scanner.close();
    }

    public static void linear(float a, float b) {
        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm!");
        } else {
            System.out.println("Phương trình có một nghiệm: " + "x = " + (-b / a));
        }
    }

    public static void quadratic(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phương trình vô số nghiệm");
                else
                    System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
