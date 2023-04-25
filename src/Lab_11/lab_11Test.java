package Lab_11;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class lab_11Test {

    @org.junit.jupiter.api.Test
    void ex_1() {
        System.out.println("////////////// ЗАДАЧА 1 ///////////");
        int kat1 = 3;
        System.out.println("катет_1 :"+kat1);
        int kat2 = 4;
        System.out.println("катет_2 :"+kat2);
        long S = Math.round((kat1 * kat2) / 2);

        System.out.printf("S трикутника дорівнює :" + S);
        System.out.println(" ");
        double hip = (Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2)));
        System.out.printf(" Гіпотенуза %.2f \n", hip);
        assertEquals(5.0,hip);
        assertEquals(6.0,S);
    }
    @org.junit.jupiter.api.Test
    void ex_2(){
        System.out.println("////////////// ЗАДАЧА 2 ///////////");
        double x = 1.8;
        double y = 1.8;
        System.out.println(" X :"+x);
        System.out.println(" Y :"+y);
        int r = 3;
        double R = 2.5;
        boolean v_R=false;
/// 1,8///
        if (((0 - x) * (0 - x) + (0 - y) * (0 - y) <= r * r) && ((0 - x) * (0 - x) + (0 - y) * (0 - y) >= R * R)){
            v_R=true;
            System.out.println(" Входить в область ");}
        else
            System.out.println(" Не входить в область ");
        assertEquals(true,v_R);

    }
    @org.junit.jupiter.api.Test
    void ex_3(){
        System.out.println("////////////// ЗАДАЧА 3 ///////////");
        double epsilon = 1e-6;
            double sum = 0.0;
            double term = 1.0;
            int i = 1;
            while (Math.abs(term) >= epsilon) {
                sum += term;
                i++;
                term = 1.0 / (i * i);
            }
             //Math.sqrt(sum * 6.0);
            double piExact = Math.pow(Math.PI,2)/6;
            assertEquals(piExact,sum);
    }
    @org.junit.jupiter.api.Test
    void ex_4(){
        System.out.println("////////////// ЗАДАЧА 4 ///////////");
        int size = 18;
        double sum2 = 0;
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] =i+1;
            System.out.printf("Елемент"+(i+1)+" :"+arr[i]);
            System.out.println(" ");
        }
        for (int i = 0; i < size; i++){
            sum2 += arr[i];
        }
        System.out.println(" Sum elementov : "+sum2);
        assertEquals(171,sum2);
    }
    @org.junit.jupiter.api.Test
    void ex_5(){
        System.out.println("////////////// ЗАДАЧА 5 ///////////");
        double yMax;
         yMax =0  ;

        for (int x = -3; x <= 4; x +=1) {
            double y = Math.pow(x, 3) - 2 * Math.pow(x, 2) + x - 1;

            if (y > yMax) {
                yMax = y;
            }
        }

        System.out.println("Максимальне значення функції f(x)=x^3-2x^2+x-1  на відрізку [-3,4]: " + yMax);
        assertEquals(35,yMax);
    }
}