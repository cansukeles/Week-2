import java.util.Scanner;

public class Main {
    //Methodlar tanımlanır.

    static int calculatePower(int taban, int us) {
      if (us == 0) {
          return 1;
      }
      int result = calculatePower(taban, us - 1);
      result *= taban;
      return result;
    }

    //Taban ve üs değerleri kullanıcıdan alınır.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();
        System.out.println("Sonuç: " + calculatePower(taban, us));
    }
}