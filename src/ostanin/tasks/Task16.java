package ostanin.tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("возведение числа x в степень y:");
        System.out.println("Введиче целое число:");
        x = in.nextInt();
        System.out.println("Введиче степень числа:");
        y = in.nextInt();
        System. out. println("Результат " + (int)Math. pow(x, y));
        }


    }
