package shapes;
import static java.lang.Math.abs;
import colors.Color;
import java.io.IOException;

public class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle(){
        this.point = new Point(0,0);
        this.radius = 2;
    }
    public Circle(Point point, double radius){
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {return this.point;}
    public void setPoint(Point point) {this.point = point;}
    public double getRadius() {return this.radius;}
    public void setRadius(double radius) {this.radius = radius;}

    private void validate() throws Exception {
        try {
            int r = (int) radius;
            int a = 1/r;
            a = 1/(abs(r)+r);
        }catch (ArithmeticException e){
            System.out.println("Warning, radius<=0");
        }
    }

    @Override
    public void move(double moveX, double moveY) {
        this.point.setX(this.point.getX()+moveX);
        this.point.setY(this.point.getY()+moveY);
    }
    @Override
    public double getS(){return 3.14*radius*radius;}
    @Override
    public double getP(){return 6.28*radius;}

    public void draw(){
        System.out.println("Круг");
        System.out.println("Координаты центра (" + point.getX() + "," + point.getY() + ")");
        System.out.println("Радиус " + radius);
        System.out.println("Площадь " + this.getS());
        System.out.println("Периметр " + this.getP());
        System.out.println("Цвет " + color);
    }
}
