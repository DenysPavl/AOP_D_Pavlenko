package Lab_2;
import java.util.Scanner;
import static java.lang.Math.*;

public class lab_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a,b,c;
            System.out.printf("Введіть три сторони трикутника \n");
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            Triangle trikytnuk =new Triangle(a,b,c);
            trikytnuk.Rozwazok();



        }
    }
    class Triangle{
        int  a;
        int b;
        int c;
        boolean F;
        double Per,S;
        Triangle(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
            if(a+b<c || a+c<b ||c+b<a) {
                System.out.printf("Такого трикутнака не існує");
                F=false;
            }
            else {
                System.out.printf("Трикутник існує");
                F=true;
            }
        }
        void Rozwazok() {
            if (F==true) {
                Per = a + b + c;
                double p = Per / 2;
                S = sqrt((p * (p - a) * (p - b) * (p - c)));
                System.out.printf(" Периметр : "+ Per +"\n Площа :"+S);
            }
            else {
                System.out.printf(" Трикутника не існує, не намагайтеся.");
            }
        }
    }

