package org.example;
import java.util.Scanner;
public class Task2 {
    public static void NumberFormatException1() {
        System.out.println("Введите свой возраст: ");
        Scanner sc = new Scanner(System.in);
        try {
            String ageInput = sc.nextLine();
            int age = Integer.parseInt(ageInput);
            System.out.println(age);
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный формат ");
        }
    }
}
