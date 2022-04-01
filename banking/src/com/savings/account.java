package com.savings;

import java.util.Scanner;

public class account {
        private Long accNumber;
        private String name;
        private String acc_type;
        private Long balance;
        Scanner sc = new Scanner(System.in);
        public void openAccount() {
            System.out.print("Enter Account No: ");
            accNumber= sc.nextLong();
            System.out.print("Enter Account type: ");
            acc_type = sc.next();
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter Balance: ");
            balance = sc.nextLong();
        }
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accNumber);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);



}




}












