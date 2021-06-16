package com.company;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner hihi = new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        a = hihi.nextInt();
        System.out.println("nhap so thu 2");
        b = hihi.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("ktra lai so vua nhap");

        }
        while (a != b) {
            if (a < b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("uoc chung lon nhat la "+a);
    }
}
