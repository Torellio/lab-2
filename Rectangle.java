package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon{

    private xPoint a;
    private xPoint b;
    private xPoint c;
    private float height;
    private float width;
    
    public Rectangle(xPoint a, xPoint b, xPoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
        height = Line.getLenght(a, b);
        width = Line.getLenght(b, c);
    }
    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public float getArea() {
        return height * width;
    }
    
}
