package Lab_11;

import java.util.Scanner;

public class lab_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("////////////// ЗАДАЧА 1 ///////////");
        System.out.println(" Введіть катет_1 :");
        int kat1 = in.nextInt();
        System.out.println(" Введіть катет_2 :");
        int kat2 = in.nextInt();
        long S = Math.round((kat1 * kat2) / 2);

        System.out.printf("S трикутника дорівнює :" + S);
        System.out.println(" ");
        double hip = (Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2)));
        System.out.printf(" Гіпотенуза %.2f \n", hip);

    }
}
