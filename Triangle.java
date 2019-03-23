package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Polygon{
    
    private xPoint a;
    private xPoint b;
    private xPoint c;
    private float line_1;
    private float line_2;
    private float line_3;
    
    private float perimeter;
    
    public Triangle(xPoint a, xPoint b, xPoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
        line_1 = Line.getLenght(a, b);
        line_2 = Line.getLenght(b, c);
        line_3 = Line.getLenght(a, c);
        perimeter = line_1 + line_2 + line_3;
    }
    
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getPerimeter() {
        return perimeter;
    }

    @Override
    public float getArea() {
        return (float) Math.sqrt(perimeter * (perimeter - line_1) * (perimeter - line_2) * (perimeter - line_3));
    }
    
}
