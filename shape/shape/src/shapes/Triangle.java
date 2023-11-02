package shapes;

import static java.lang.Math.*;

public class Triangle extends Shape{
    private Point A,B,C;

    public Triangle(){
        this.A = new Point(0,0);
        this.B = new Point(2,0);
        this.C = new Point(2,2);
    }
    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void setA(Point A){this.A = A;}
    public void setB(Point B){this.B = B;}
    public void setC(Point C){this.C = C;}
    public Point getA(){return this.A;}
    public Point getB(){return this.B;}
    public Point getC(){return this.C;}

    private void validate() throws Exception {
        try {
            int a = 1/(int)(2*A.getX()-C.getX()-B.getX());
            a = 1/(int)(2*A.getY()-C.getY()-B.getX());
        }catch (ArithmeticException e){
            System.out.println("Warning, points on one straight line");
        }
    }

    @Override
    public void move(double moveX, double moveY) {
        this.A.setX(this.A.getX()+moveX);
        this.A.setY(this.A.getY()+moveY);
        this.B.setX(this.B.getX()+moveX);
        this.B.setY(this.B.getY()+moveY);
        this.C.setX(this.C.getX()+moveX);
        this.C.setY(this.C.getY()+moveY);
    }
    @Override
    public double getS(){return abs((B.getX()-A.getX())*(C.getY()-A.getY())-(C.getX()-A.getX())*(B.getY()-A.getY()))/2;}
    @Override
    public double getP(){return sqrt(pow(B.getX()-A.getX(),2)+pow(B.getY()-A.getY(),2))+sqrt(pow(C.getX()-B.getX(),2)+pow(C.getY()-B.getY(),2))+sqrt(pow(A.getX()-C.getX(),2)+pow(A.getY()-C.getY(),2));}

    public void draw(){
        System.out.println("Треугольник");
        System.out.println("Координаты точки A (" + A.getX() + "," + A.getY() + ")");
        System.out.println("Координаты точки B (" + B.getX() + "," + B.getY() + ")");
        System.out.println("Координаты точки C (" + C.getX() + "," + C.getY() + ")");
        System.out.println("Площадь " + this.getS());
        System.out.println("Периметр " + this.getP());
        System.out.println("Цвет " + color);
    }
}
