package javatest;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Task1 task = new Task1();
        System.out.println("Enter first number: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstNumber = scanner1.nextLine();
        System.out.println("Enter second number: ");
        Scanner scanner2 = new Scanner(System.in);
        String secondNumber = scanner2.nextLine();

        String a = firstNumber;
        String b = secondNumber;
        String c = task.summa(a, b);
        System.out.println("Sum is: " + c);

    }
}