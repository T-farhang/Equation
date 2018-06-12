/*
                Tahereh Farhang , Barbod Accademy , 2nd session , 6th excercise.
                            ٍQuadratic Equation.
 */
package Equation;

import java.util.Scanner;

/**
 *
 * @author Totia
 */
public class Equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter factor x^2 : ");
        int a = sc.nextInt();
        while (a == 0) {
            System.out.println("Factor x^2 cannot be zera! Try another one:");
            a = sc.nextInt();
        }
        System.out.print("Please enter factor x : ");
        int b = sc.nextInt();
        System.out.print("Please enter constant : ");
        int c = sc.nextInt();
        System.out.println(String.format("%dx^2 + %dx + %d = 0", a, b, c));

        int delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("The equation doesn't have answer!");
        } else if (delta == 0) {
            int x = (-b) / (2 * a);
            System.out.println("The equation has one answer : ");
            System.out.println(String.format("x = %d", x));
        } else {
            double Sqrt = Math.sqrt(delta);
            double x1 = (((-b) + Sqrt) / 2 * a);
            double x2 = (((-b) - Sqrt) / 2 * a);
            System.out.println(String.format("x1 = %f , x2 = %f", x1, x2));
        }
    }

}
