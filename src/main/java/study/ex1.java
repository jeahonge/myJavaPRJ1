package study;

public class ex1 {
    public static void main(String[] args) {
        {
            int k = 7;

            for (int i = 1; i <= k; i++) {
                if (i <= k / 2 + 1) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= k - i + 1; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
