package study;
import java.util.Scanner;
public class ex_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b;
        System.out.print("첫 번째 : ");
        a = s.nextInt();

        System.out.print("두 번째 : ");
        b = s.nextInt();

        if (a > b) {
            System.out.println("a는 b보다 큽니다.");

        } else if (a == b) {
            System.out.println("a는 b와 같습니다.");

        } else {
            System.out.println("a는 b보다 작습니다.");
        }
        s.close();
    }
}

