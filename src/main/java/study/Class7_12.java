package study;
class Rabbit3{
    private  String shape;
    private  int xPos;
    private int yPos;

    void setPosition(int xPos,int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
public class Class7_12 {
    public static void main(String[] args) {

        Rabbit3 r = new Rabbit3();

//      r.xPos = 100;  에러(접근못함)
        r.setPosition(100,200);
    }
}
