package Lab_10;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lab_10 {
    public static void main(String[] args) throws Exception{
        File file=new File("E:/Java/Input.txt");
        Scanner scan = new Scanner(file);
        String line= scan.nextLine();
        String [] s_numbers = line.split(" ");
        int[] numbers=new int [3];
        int counter=0;
        for (String s_number : s_numbers){
            numbers[counter++]=Integer.parseInt(s_number);
        }
        System.out.println(" elem in Input.txt :");
        System.out.println(Arrays.toString(numbers));

        int a=numbers[0];
        int b=numbers[1];
        int c=numbers[2];
        quadratic_equation(a,b,c);
        //  System.out.println(a+" "+b+" "+c);
        scan.close();
    }
    static void quadratic_equation(int a, int b, int c) throws Exception{
        System.out.println(a+"x^2 + "+b+"x + "+c+"= 0");
        double D =( b * b - 4 * a * c);
        System.out.println("Дискримінвнт: "+D);
        double x1,x2;
        x1 = (-b - Math.sqrt(D)) / (2 * a);
        x2 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println("Корені: x1 = " + x1 + ", x2 = " + x2);
        FileWriter nFile = new FileWriter("Output.txt");

        nFile.write(x1 + " " + x2);
        nFile.close();
    }
}
