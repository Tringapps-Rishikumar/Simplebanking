package org.example;

import java.util.Scanner;

public class Bankmain {
    public static void main(String []args) {
        int no;
        String name;

        Scanner bn = new Scanner(System.in);

        System.out.println("*welcome to your bank*");
        System.out.print("Enter your Name:");
        name = bn.next();
        System.out.print("Enter your Account number:");
        no = bn.nextInt();
        Bank bank = new Bank(no,name);
        while(no>0){

            System.out.println("service provided:");
            System.out.print("\n1)Deposit\n2)Total balance\n3)withdraw\n4)Exit\nEnter your choice:");
            int x = bn.nextInt();
            switch (x) {
                case 1:
                    System.out.println("enter the amount to be deposited:");
                    int dep = bn.nextInt();
                    bank.deposit(dep);
                    break;
                case 2:
                    System.out.println( bank.Current_balance());
                    break;

                case 3:
                    System.out.println("enter the amount to be withdraw:");
                    int dra = bn.nextInt();
                    bank.Withdraw(dra);
                    break;

                case 4:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
        }
    }

}
class Bank{
    int Acc_no;
    String Acc_name;
    int Balance=0;



    public  Bank(int Acc_no,String Acc_name)
    {
        this.Acc_no=Acc_no;
        this.Acc_name=Acc_name;
        System.out.println("Name:"+Acc_name);
        System.out.println("Account number:"+Acc_no);
    }
    public void deposit(int n)
    {
        Balance=Balance+n;
    }
    public void Withdraw(int n1)
    {
        Balance=Balance-n1;
    }
    int Current_balance()
    {
        System.out.println("Current_balance:");
        return Balance;
    }
}