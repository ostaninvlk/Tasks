package Package1;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Привет мир");
        System.out.println("Мои документы");
     for (int i=0; i <args.length; i++) {
         System.out.println("args[" + i + "] = " + args[i]);
     }
    }
}
