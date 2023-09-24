import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int closestSmallerNumber = list[0];
        int closestBiggerNumber = list[0];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i : list) {
            if (i > number) {
                int x = closestBiggerNumber - number;
                int y = i - number;
                if (y < x || closestBiggerNumber < number) {
                    closestBiggerNumber = i;
                }
            } else {
                int x = number - closestSmallerNumber;
                int y = number - i;
                if (y < x || closestSmallerNumber > number) {
                    closestSmallerNumber = i;
                }
            }
        }
        System.out.println("Closest bigger number is: " + closestBiggerNumber);
        System.out.println("Closest smaller number is: " + closestSmallerNumber);

    }
}
