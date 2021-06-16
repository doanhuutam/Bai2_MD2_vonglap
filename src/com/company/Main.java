package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("kp so ngto");
        } else {
            int i = 2;
            boolean check = true;
//            taij sao tại đây không sử dụng được vòng for
            while (i< number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("day la songTO");
            }else {
                System.out.println("kp soNGto");
            }

        }
    }
}