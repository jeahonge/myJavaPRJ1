package study;
class Rabbit11{
    String shape;
    int xpos;
    int ypos;

    void move(int x, int y){
        this.xpos = x;
        this.ypos = y;
        System.out.println("xpos : " + xpos + " / ypos " + ypos);
    }
}
class HouseRabbit extends Rabbit11{
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }
    @Override
    void move(int x, int y){
        super.move(x,y);
    }
}

class MountainRabbit extends Rabbit11{
    String mountain;
    void eatwildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Class8_2 {
    public static void main(String[] args) {
    HouseRabbit hRabbit = new HouseRabbit();
    MountainRabbit mRabbit = new MountainRabbit();

    hRabbit.shape = "삼각형";
    hRabbit.owner = "난쟁이";
    hRabbit.move(100,100);
    hRabbit.eatFeed();

    mRabbit.shape = "네모";
    mRabbit.mountain = "설악산";
    mRabbit.move(200,200);
    mRabbit.eatwildglass();
    }
}
