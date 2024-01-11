package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA: " + rectangle.Area());
        System.out.println("PERIMETRO: " + rectangle.Perimetro());
        System.out.println("DIAGONAL: " + rectangle.Diagonal());
        
        sc.close();
    }

}
