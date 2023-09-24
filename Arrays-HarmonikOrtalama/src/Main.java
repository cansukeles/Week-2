public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        double result = 0.0;
        for (double i = 0; i < numbers.length; i++) {
            result += (double) 1 / numbers[(int) i];

        } System.out.println("Result: " + numbers.length/result);


    }
}