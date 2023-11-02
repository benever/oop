package shapes;

import colors.Color;

public abstract class Shape{
    public Color color = Color.TRANSPARENT;
    protected double S,P;

    public void setColor(Color a){this.color = a;}
    public Color getColor(){
        return this.color;
    }
    public double getS(){return this.S;}
    public double getP(){return this.P;}

    public void move(double moveX, double moveY) {}
    public void draw() {}
}
