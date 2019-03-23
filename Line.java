/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author AVeselkov
 */
public class Line {
    
    private xPoint x;
    private xPoint y;
    
    public Line(xPoint x, xPoint y) {
        this.x = x;
        this.y = y;
    }
    
    public static float getLenght(xPoint x, xPoint y){
        return (float) Math.sqrt(Math.pow((x.getX() - y.getX()), 2) + Math.pow((x.getY() - y.getY()), 2));
    }
    
}
