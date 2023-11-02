package first;

import static java.lang.Math.*;

/**
 * @author Kirill
 * @version 1.0
 * @since 2023-13-10
 */
public class Vector {
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;

    /**
     * Конструктор с параметрами
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Конструктор без параметров
     */
    public Vector() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * Вывод координат вектора а
     * @param a
     */
    private static void printVector(Vector a){
        System.out.println("Начало вектора ("+a.getX1()+","+a.getY1()+")"+" конец вектора ("+a.getX2()+","+a.getY2()+")");
    }

    /**
     * Метод векторного произведения а на b
     * @param a
     * @param b
     * @return
     */
    public static double vectorVecProduct(Vector a, Vector b){
        return (a.getX2()-a.getX1())*(b.getY2()-b.getY1())-(a.getY2()-a.getY1())* (b.getX2()-b.getX1());
    }

    /**
     * Метод скалярного произведения а на b
     * @param a
     * @param b
     * @return
     */
    public static double vectorScalProduct(Vector a, Vector b){
        return (a.getX2()-a.getX1()) * (b.getX2()-b.getX1()) + (a.getY2()-a.getY1())*(b.getY2()-b.getY1());
    }

    /**
     * Метод нахождения длины вектора а
     * @param a
     * @return
     */
    public static double vectorLength(Vector a){
        return sqrt(pow((a.getX2()- a.getX1()),2)+pow((a.getX2()- a.getX1()),2));
    }

    /**
     * Метод для вычисления произведения вектора на число
     * @param a вектор
     * @param n число
     */
    public static void vectorOfNumber(Vector a, double n){
        Vector c = new Vector();
        c.setX1(a.getX1()*n);
        c.setX2(a.getX2()*n);
        c.setY1(a.getY1()*n);
        c.setY2(a.getY2()*n);
        printVector(c);
    }

    /**
     * Метод для вычисления суммы векторов а и b
     * @param a
     * @param b
     */
    public static void vectorSum(Vector a, Vector b){
        Vector c = new Vector();
        c.setX1(a.getX1()+b.getX1());
        c.setX2(a.getX2()+b.getX2());
        c.setY1(a.getY1()+b.getY1());
        c.setY2(a.getY2()+b.getY2());
        printVector(c);
    }

    /**
     * Метод для вычисления разности векторов а и b
     * @param a
     */
    public static void vectorDifference(Vector a, Vector b){
        Vector c = new Vector();
        c.setX1(a.getX1()-b.getX1());
        c.setX2(a.getX2()-b.getX2());
        c.setY1(a.getY1()-b.getY1());
        c.setY2(a.getY2()-b.getY2());
        printVector(c);
    }

    /**
     * Метод мейн
     * @param args не используется
     */
    public static void main(String[] args) {
        Vector a = new Vector(1,1,2,2);
        Vector b = new Vector(3,3,7,5);
        System.out.println(vectorVecProduct(a,b));
        System.out.println(vectorScalProduct(a,b));
        System.out.println(vectorLength(a));
        vectorOfNumber(a,5);
        vectorSum(a,b);
        vectorDifference(a,b);
    }
}