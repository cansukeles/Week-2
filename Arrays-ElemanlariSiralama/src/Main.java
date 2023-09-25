import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int arraySize = input.nextInt();

        int [] list = new int[arraySize];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < arraySize; i++) {
            System.out.print((i +1) + ". Eleman: ");
            int eleman = input.nextInt();
            list[i] = eleman;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}