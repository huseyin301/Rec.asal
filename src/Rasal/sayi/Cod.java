package Rasal.sayi;
import java.util.Scanner;
public class Cod {

    public static int  power(int a){

        int count = 0;

        for (int i = 1; i <= a; i++){

            if (a % i == 0){

                count++;

            }

        }

        if (count == 2){

            System.out.println(a + " Sayısı asaldır.");

        }else {

            System.out.println(a + " Sayısı asal değildir.");

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sayıyı girin : ");
        int a = sc.nextInt();

        power(a);

    }
}
