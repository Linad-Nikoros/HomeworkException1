package org.example;
import java.util.Scanner;
public class Task1 {
   public static void ArithmeticException1() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите 1 число: ");
       int num1 = sc.nextInt();
       System.out.println("Введите 2 число: ");
       int num2 = sc.nextInt();
       try {
           int result = num1 / num2;
           System.out.println("Результат равен: " + result);
       } catch (ArithmeticException e) {
           System.out.println("Деление на ноль");
       }
   }
}
