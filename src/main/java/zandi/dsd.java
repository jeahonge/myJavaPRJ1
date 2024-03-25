package zandi;

import java.util.Scanner;

public class dsd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        a = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + a);

        int b;
        b = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + b);

        System.out.println("값==> "+ a*b);

        s.close();
    }
}

