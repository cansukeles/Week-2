import java.util.Scanner;

public class Main {

    //Methodlar tanımlanır.

    static boolean isPrimeNumber(int a, int b) {
        if (b == 1) {
            return true;
        }
        if (a % b == 0) {
            return false;
        }
        return isPrimeNumber(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a positive number: ");
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("Please write a positive number: ");
        }
        System.out.println();

        boolean isPrime = isPrimeNumber(number, number - 1);
        if (isPrime) {
            System.out.println(number + " is a prime number!");
        } else {
            System.out.println(number + " is not a prime number!");
        }

    }
}