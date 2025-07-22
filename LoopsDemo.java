public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDo-While loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);
    }
}
