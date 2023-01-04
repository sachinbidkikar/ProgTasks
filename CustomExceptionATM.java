package com_box.exceptionDemos;

import java.util.Scanner;

public class CustomExceptionATM {
    public static void withdrawAmount(int amount){
        if(amount <= 5000 ){
            System.out.println("Rs." +amount +" has been debited ");
        } else{
            try{
                throw new AmountLimitExceedException();
            } catch (AmountLimitExceedException e){
                e.showamountlimit(amount);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount To Withdraw");
        int amount = sc.nextInt();
        withdrawAmount(amount);
    }
}
class AmountLimitExceedException extends Exception{
    public void showamountlimit(int amount){
        System.out.println("Insufficient fund to withdraw Rs. " +amount +" Available Limit is 5000");
    }
}
