package Lab_1;
import java.util.Scanner;
public class lab_1 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //////////////////////////////Ex1
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

            //////////////////////////Ex2
            System.out.println("////////////// ЗАДАЧА 2 ///////////");
            System.out.println(" Введіть X :");
            double x = in.nextDouble();
            System.out.println(" Введіть Y :");
            double y = in.nextDouble();
            int r = 3;
            double R = 2.5;
/// 1,8///
            if (((0 - x) * (0 - x) + (0 - y) * (0 - y) <= r * r) && ((0 - x) * (0 - x) + (0 - y) * (0 - y) >= R * R))
                System.out.println(" Входить в область ");
            else
                System.out.println(" Не входить в область ");

            //////////////////////////////Ex3
            System.out.println("////////////// ЗАДАЧА 3 ///////////");


            //////////////////////////////Ex4
            System.out.println("////////////// ЗАДАЧА 4 ///////////");
            int size = 18;
            double sum = 0.0;
            double[] arr = new double[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Елемент _%d :",(i+1));
                System.out.println(" ");
                arr[i] =in.nextDouble();
            }



            for (int i = 0; i < size; i++){
                sum += arr[i];
            }
            System.out.printf(" Sum elementov : "+sum);
        }
    }

