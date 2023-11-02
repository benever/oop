import colors.Color;
import service.impl.ShapesServiceImpl;
import shapes.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Shape> shapes = new ArrayList<>();

        Point pointA_triangle = new Point(0,0);
        Point pointB_triangle = new Point(0,4);
        Point pointC_triangle = new Point(4,0);
        Triangle triangle = new Triangle(pointA_triangle, pointB_triangle, pointC_triangle);
        triangle.setColor(Color.RED);

        Point point_circle = new Point(3,3);
        Circle circle = new Circle(point_circle, 2);
        circle.setColor(Color.WHITE);

        Point point_circle2 = new Point(2,5);
        Circle circle2 = new Circle(point_circle2, 4);
        circle2.setColor(Color.YELLOW);

        Point pointA_rectangle = new Point(1,1);
        Point pointC_rectangle = new Point(5,2);
        Rectangle rectangle = new Rectangle(pointA_rectangle, pointC_rectangle);

        Point point = new Point(100,100);

        Point pointA_triangle2 = new Point(-2,3);
        Point pointB_triangle2 = new Point(4,3);
        Point pointC_triangle2 = new Point(2,5);
        Triangle triangle2 = new Triangle(pointA_triangle2, pointB_triangle2, pointC_triangle2);
        triangle2.setColor(Color.BLUE);

        shapes.add(triangle);
        shapes.add(triangle2);
        shapes.add(circle);
        shapes.add(circle2);
        shapes.add(rectangle);

        ShapesServiceImpl service = new ShapesServiceImpl();

        System.out.println(service.getSquares(shapes));
        System.out.println(service.getMaxPerimeters(shapes));
        System.out.println(service.getColor(shapes));
    }
}