package study;

public class ex1 {
    public static void main(String[] args) {
        {
            int rows = 7; // 총 행 수

            // 위쪽 반 삼각형 출력
            for (int i = 1; i <= rows; i++) {
                if (i <= rows / 2 + 1) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= rows - i + 1; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
