import java.util.Scanner;

public class Main {
    //Methodlar tanımlanır.
    static int power(int taban, int us) {
        int result = 1;
        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        return result;
    }

    //Taban ve üs değerleri kullanıcıdan alınır.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();

        System.out.println("Sonuç: " + power(taban, us));
    }
}