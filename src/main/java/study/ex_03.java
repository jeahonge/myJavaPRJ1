package study;

public class ex_03 {
    public static void main(String[] args) {

        int a = 4;

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a - i ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i  || i == a - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

