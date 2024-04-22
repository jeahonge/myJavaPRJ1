package study;

public class Sample7 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {       //i가 0~3까지 1씩증가하여 반복 (줄 수)
            for (int j = 1; j < 8; j++) {   //j가 1~7까지 1씩증가하여 반복 (칸 수)
                if (j > 3 - i && j < 5 + i){    //  4-i-1보다 크며 4+i+1보다 작을때 별을 찍는다, 규칙성에 해당되는 범위 일때
                    System.out.print("*"); //별이 출력된다
                }else {                     //해당되지 않을때
                    System.out.print(" ");  //공백을 출력한다
                }

            }
            System.out.println();       //i값이 바뀔때 마다 줄이 바뀐다

        }
    }
}
