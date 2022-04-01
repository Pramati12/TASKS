package com.savings;



import java.util.Scanner;

public class balance {

    Long accountNumber;
    String accountName;
    String BankName;
    Long IFSC;
    Long balance;

    Scanner sc=new Scanner(System.in);
        public double getBalance()
        {
            balance=sc.nextLong();
            return balance;
        }



    }




