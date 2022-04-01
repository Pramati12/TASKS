package com.savings;

import java.util.Scanner;

public class transaction {
    Long withDrawlAmount;
    Long balance;
    Scanner sc=new Scanner(System.in);
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you  to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
}
