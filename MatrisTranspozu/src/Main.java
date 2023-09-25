public class Main {
    public static void main(String[] args) {
        int[][] original = {{2, 3, 4}, {5, 6, 4}, {7, 8, 4}};
        int[][] transpose = new int[3][3];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                transpose[i][j] = original[j][i];

            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Transpose matrix: ");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}