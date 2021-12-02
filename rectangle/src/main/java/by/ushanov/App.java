package by.ushanov;

import by.ushanov.rectangl.Rectangle;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1,num2);

        rec.viewResult();
    }
}
