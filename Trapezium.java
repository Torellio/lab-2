package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium implements Shape, Polygon {
    
    private xPoint a;
    private xPoint b;
    private xPoint c;
    private xPoint d;
    private float top;
    private float bottom;
    private float left;
    private float right;
    private float height;
    
    public Trapezium(xPoint a, xPoint b, xPoint c, xPoint d) {
        bottom = Line.getLenght(a, d);
        top = Line.getLenght(b, c);
        left = Line.getLenght(a, b);
        right = Line.getLenght(c, d);
        height = b.getY() - a.getY();
    }
    
    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float getPerimeter() {
        return top + bottom + left + right;
    }

    @Override
    public float getArea() {
        return (top + bottom) * height / 2;
    }
}
