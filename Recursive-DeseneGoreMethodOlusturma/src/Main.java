import java.util.Scanner;

public class Main {
    public static void pattern(int n, int orgN) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }
        if (n > 0 && n <= orgN) {
            pattern(n - 5, orgN);
        } else {
            pattern(n + 5, orgN);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a positive number: ");
        int n = scan.nextInt();
        pattern(n, n);

    }
}