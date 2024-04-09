package study;
import java.util.Scanner;
public class ex_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 15 == 0) {
            System.out.println("3과 5의배수 둘다 만족합니다.");

        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");

        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");

        } else {
            System.out.println("해당없습니다.");
        }

        s.close();
    }
}

