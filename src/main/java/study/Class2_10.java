package study;

import java.util.Scanner;

public class Class2_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        num = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + num);

        s.close();
    }
}
