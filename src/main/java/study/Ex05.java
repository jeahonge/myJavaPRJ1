class Car{
    private int speed;
    private  String color;

    void setCar(int speed, String color){
        this.speed = speed;
        this.color = color;
    }

    Car(int speed){
        this.speed = speed;
    }
}

public class Ex05{
    public static void main(String[] args) {
        Car car = new Car(100);
    }
}