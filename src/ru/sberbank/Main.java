package ru.sberbank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double parameter_1 = scanner.nextDouble();
        Double parameter_2 = scanner.nextDouble();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println(circle.area(parameter_1));
        System.out.println(rectangle.area(parameter_1, parameter_2));
        System.out.println(square.area(parameter_1));
    }
}
