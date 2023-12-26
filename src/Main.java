import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int person;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        person = inp.nextInt();

        for (int i=1; i<=person; i*=4) {

            System.out.println(i);
        }
        for (int k = 1; k<=person; k *= 5) {

            System.out.println(k);
        }
    }
}