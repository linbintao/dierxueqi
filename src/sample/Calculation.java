package sample;

public class Calculation {
    public static void main(String[] args){
        Shape shape = new Round();
        shape.radius=7;
        shape.area();
        shape = new rectangle();
        shape.high=4;
        shape.width = 6;
        shape.area();
    }

}
