package shapes;

import colors.Color;

public class Point extends Shape{
    private double x,y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}

    public void draw(){
        System.out.println("Точка");
        System.out.println("Координаты (" + getX() + "," + getY() + ")");
        System.out.println("Цвет " + color);
    }

    @Override
    public void move(double moveX, double moveY) {
        this.x += moveX;
        this.y += moveY;
    }
}
