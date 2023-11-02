package service.impl;

import colors.Color;
import service.ShapesService;
import shapes.Circle;
import shapes.Point;
import shapes.Shape;
import shapes.Triangle;

import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class ShapesServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        double sum = 0;

        for (int i = 0; i < shapeList.size(); i++) {
            sum += shapeList.get(i).getS();
        }

        return sum;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxP=0;

        for (int i = 0; i < shapeList.size(); i++) {
            if(maxP < shapeList.get(i).getP()){
                maxP = shapeList.get(i).getP();
            }
        }

        return maxP;
    }

    @Override
    public Set<Color> getColor(List<Shape> shapeList) {
        HashSet<Color> colors = new HashSet<Color>();
        for (int i = 0; i < shapeList.size(); i++) {
            colors.add(shapeList.get(i).getColor());
        }
        return colors;
    }
}
