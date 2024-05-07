package study;
class Rabbit1{
   String shape;
   int xPos;
   int yPos;

   Rabbit1(){
       shape = "토끼";
   }

   Rabbit1(String shape){
       this.shape = shape;
   }
   void setPosition(int xPos,int yPos){
       this.xPos = xPos;
       this.yPos = yPos;
   }
}

public class Class7_10 {
    public static void main(String[] args) {
        String rabbitColor ="파란색";

        Rabbit1 rabbit2 = new Rabbit1(rabbitColor);
        System.out.println("rabit : " + rabbit2.shape);

        Rabbit1 rabbit = new Rabbit1();
        System.out.println("rabit : "+ rabbit.shape);
    }
}
