package ostanin.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x:");
        int x = in.nextInt();
        int y = x%10;
        System.out.println("Младший рязряд x = " + y );
    }
    }
