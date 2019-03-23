package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];
        
        for (int i = 0; i < shapes.length; i++){
            shapes[i] = factory.getInstance();
        }
        
        Shape max = shapes[0];
        for (int i=0; i < shapes.length; i++) {
            if (shapes[i].getArea() > max.getArea()) {
                max = shapes[i];
            }
        }
        
        System.err.println("MAX: " + max.getArea());
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    }
}
