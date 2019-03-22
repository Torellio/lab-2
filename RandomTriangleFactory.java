/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.xPoint;

/**
 *
 * @author AVeselkov
 */
public class RandomTriangleFactory implements ShapeFactory {
    
    @Override
    public Shape getInstance() {
        
        xPoint a = new xPoint(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);
        xPoint b = new xPoint(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);
        xPoint c = new xPoint(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);
        return new Triangle(a, b, c);
    }
    
}