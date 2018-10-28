package ostanin.tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("введите x:");
        x = in.nextInt();
        System.out.println("введите y:");
        y = in.nextInt();
        System.out.println("введите z:");
        z = in.nextInt();
        double sum = (x + y + z)/3;
        System.out.println("Среднеарифметическое суммы чисел x, y, z = " + "" + sum);
    }
}
