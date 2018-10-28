package ostanin.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Введите значение X: " );
        int x = in.nextInt();
        int y = x/10;
        System.out.println("В числе X - " + y + " десятков");
    }
}
