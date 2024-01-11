package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("entre com os valores do trinagulo x");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("entre com os valores do trinagulo y");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        
        double areaX = x.area();
        
        double areaY = y.area();
        
        System.out.println("x = " + areaX);
        System.out.println("y = " + areaY);

        if (areaX > areaY) {
            System.out.println("a area de X e maior");
        }
        else
        {
            System.out.println("a area de Y e maior");
        }


        sc.close();
    }
}
