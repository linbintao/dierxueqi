package sample;

public class rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("矩形的面积是"+high*width);
    }
}
