package ru.avalon.java.dev.j10.labs.factories;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словаим, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {

    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */

    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    public Shape getInstance() {

        /*
         * TODO: Реализовать метод 'getInstance()' класса 'RandomShapeFactory'
         */
        
        int r = new Random().nextInt(5) + 1;

        switch (r) {
            case 1:
                return new RandomCircleFactory().getInstance();
            case 2:
                return new RandomTriangleFactory().getInstance();
            case 3:
                return new RandomRectangleFactory().getInstance();
            case 4:
                return new RandomRhombusFactory().getInstance();
            case 5:
                return new RandomTrapeziumFactory().getInstance();
            default:
                return new RandomCircleFactory().getInstance();
        }
    }
}
