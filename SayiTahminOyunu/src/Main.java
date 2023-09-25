import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random()* 100);
        System.out.println(number);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while(right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scan.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
                if(!isWrong) {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde can hakkınız düşülecektir.");
                } else {
                    right++;
                    System.out.println("Fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));
                }
                continue;
            }

            if(selected == number) {
                System.out.print("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if(selected > number){
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong [right++] = selected;
                System.out.println(5 - right + " hakkınız kaldı.");
            }
        }
        if(!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}