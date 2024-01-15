package aplication;

import java.util.Scanner;

import entities.Accaunt;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accaunt account;

        System.out.println("enter account number ");
        int number = sc.nextInt();

        System.out.println("enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("is there an initial deposit (y/n)? ");
        char responde = sc.next().charAt(0);

        if (responde == 'y') {
            System.out.println("enter the initial value: ");
            double initialValue = sc.nextDouble(); 
            account = new Accaunt(number, holder, initialValue);
        }else{
            account = new Accaunt(number, holder);
        }

        // print infos
        System.out.println();
        System.out.println("account data: ");
        System.out.println(account);

        // deposit amounts 
        System.out.println();
        System.out.println("enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("update account data: ");
        System.out.println(account);

        // withdraw amouts
        System.out.println();
        System.out.println("enter a deposit value: ");
        depositValue = sc.nextDouble();
        account.withdraw(depositValue);
        System.out.println("update account data: ");
        System.out.println(account);


        sc.close();
    }
}
