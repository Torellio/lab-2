/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.factories;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.xPoint;

/**
 *
 * @author AVeselkov
 */
public class RandomTrapeziumFactory implements ShapeFactory {
    
    @Override
    public Shape getInstance() {
        
        int top = new Random().nextInt(10) + 10;
        int bottom = new Random().nextInt(10) + 1;
        
        xPoint a = new xPoint(new Random().nextInt(10) + 1, bottom);
        xPoint b = new xPoint(new Random().nextInt(10) + 1, top); 
        xPoint c = new xPoint(new Random().nextInt(10) + 10, top);
        xPoint d = new xPoint(new Random().nextInt(10) + 10, bottom);
        return new Trapezium(a, b, c, d);
    }
    
}
