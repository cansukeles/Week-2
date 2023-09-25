public class Main {
    public static void main(String[] args) {
        int count = 1;
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};


        for (int i = 0; i < list.length; i++) {
            boolean isAlreadyFound = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isAlreadyFound = true;
                }
            }
            if (!isAlreadyFound) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kez tekrar edildi.");
            }
            count = 1;
        }

    }

}