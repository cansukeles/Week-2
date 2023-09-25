import java.util.Arrays;

public class Main {
    static boolean isFind (int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6, 3, 12, 67, 6, 12, 78, 34, 26, 3, 0, 56, 34, 78};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (i % 2 == 0)) {
                    if(!isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : dublicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}