package study;
class Rabbit10{
    String shape;
    int xpos;
    int ypos;
    static int count;

    Rabbit10(){
        count++;
    }
}
public class Class8_1 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼 수==>" + Rabbit10.count);

        Rabbit10 rabbit1 = new Rabbit10();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수==>"+Rabbit10.count);

        Rabbit10 rabbit2 = new Rabbit10();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수==>"+Rabbit10.count);
    }
}
