package Rasal.sayi;
import java.util.Scanner;
public class Cod {

    public static int  power(int a, int b){

        int total = 1;

        for (int i = 1; i <= a; i++){

        total *= b;

        }

    return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Üs değerini girin : ");
        int a = sc.nextInt();

        System.out.print("Taban değerini girin : ");
        int b = sc.nextInt();

        System.out.println(power(a , b));

    }
}
