package study;

import java.util.Scanner;

public class Class6_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2;

        while (true){
            System.out.printf("숫자1 ==>");
            num1 = s.nextInt();

            if (num1 == 0){
                break;
            }
            System.out.printf("숫자2 ==>");
            num2 = s.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + hap);
        }
        System.out.println("0을 입력해서 계산을 종료합니다");
        s.close();
    }
}
