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
public class xPoint implements Point {
    
    private int x;
    private int y;
    
    public xPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int getX() {
        return x;
    };
    
    @Override
    public int getY() {
        return y;
    };

    @Override
    public float getArea() {
        return 0;
    }
    
}
