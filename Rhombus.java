package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus implements Shape, Polygon {
    
    private xPoint a;
    private xPoint b;
    private xPoint c;
    private float cathetus1;
    private float cathetus2;
    
    public Rhombus(xPoint a, xPoint b, xPoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
        cathetus1 = Line.getLenght(a, b);
        cathetus2 = Line.getLenght(b, c);
    }

    /*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float getPerimeter() {
        return (float) Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2)) * 4;
    }

    @Override
    public float getArea() {
        return cathetus1 * cathetus2 * 2;
    }
}
