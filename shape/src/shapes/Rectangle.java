package shapes;

import static java.lang.Math.abs;

public class Rectangle extends Shape{
    private Point A,C;
    private double l,w;

    public Rectangle(){
        this.A = new Point(0,0);
        this.C = new Point(2,1);
        l = C.getX() - A.getX();
        w = C.getY() - A.getY();
    }
    public Rectangle(Point A, Point C){
        this.A = A;
        this.C = C;
        l = C.getX() - A.getX();
        w = C.getY() - A.getY();
    }

    public void setA(Point A){this.A = A;}
    public void setC(Point C){this.C = C;}
    public Point getA(){return this.A;}
    public Point getC(){return this.C;}

    private void validate() throws Exception {
        try {
            int a = 1/(int)(A.getX()-C.getX());
            a = 1/(int)(A.getY()-C.getY());
        }catch (ArithmeticException e){
            System.out.println("Warning, points on one straight line");
        }
    }

    @Override
    public void move(double moveX, double moveY) {
        this.A.setX(this.A.getX()+moveX);
        this.A.setY(this.A.getY()+moveY);
        this.C.setX(this.C.getX()+moveX);
        this.C.setY(this.C.getY()+moveY);
    }
    @Override
    public double getS(){return l*w;}
    @Override
    public double getP(){return 2*l+2*w;}

    public void draw(){
        System.out.println("Прямоугольник");
        System.out.println("Координаты точки A (" + A.getX() + "," + A.getY() + ")");
        System.out.println("Координаты точки C (" + C.getX() + "," + C.getY() + ")");
        System.out.println("Площадь " + this.getS());
        System.out.println("Периметр " + this.getP());
        System.out.println("Цвет " + color);
    }
}
