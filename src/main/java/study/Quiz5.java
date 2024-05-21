package study;

public class Quiz5 {
    public static void main(String[] args) {
        for (int i = 0; i < 81; i++) { // 9개의 단 * 9개의 곱셈 = 81
            int dan = i / 9 + 2; // 2단부터 9단
            int num = i % 9 + 1; // 1부터 9까지

            System.out.printf("%d x %d = %d\t", dan, num, dan * num);

            if (num == 9) { // 각 단의 마지막 곱셈 후 줄 바꿈
                System.out.println();
            }
        }
    }
}
