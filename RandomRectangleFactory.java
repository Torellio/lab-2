/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.xPoint;

/**
 *
 * @author AVeselkov
 */
public class RandomRectangleFactory implements ShapeFactory {
    
    @Override
    public Shape getInstance() {
        
        int x1 = new Random().nextInt(10) + 1;
        int x2 = new Random().nextInt(10) + 10;
        int y1 = new Random().nextInt(10) + 1;
        int y2 = new Random().nextInt(10) + 10;
        
        // a_ _ _ _
        // |        | 
        // |        |
        // |        | 
        // b_ _ _ _c|
        
        xPoint a = new xPoint(x1, y2);
        xPoint b = new xPoint(x1, y1);
        xPoint c = new xPoint(x2, y1);
        return new Rectangle(a, b, c);
    }
}
