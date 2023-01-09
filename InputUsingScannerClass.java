/*4.How to get Using input using Scanner Program in java*/

package com_box.practice100;

import java.util.Scanner;

public class InputUsingScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter Float value");
        float flotvalue = sc.nextFloat();
        System.out.println(flotvalue);
    }

}
