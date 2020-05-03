package newlight;

import java.awt.*;

public class Rectangle extends Figure implements Drawable {

    static final String GREEN= "\u001b[32m";

    public static void main(String[] args) {
         int length = 5;
        int width = 6;
        int square = square(length, width);
        int perimeter = perimeter(length, width);
    Drawable.draw(square, perimeter, length, width);
        }


    public static String ifIsSquare(int length, int width){
        return length==width ? "квадрат" : "прямоугольник";
    }

        public static int square(int a, int b){
            return Figure.square(a, b);
        }

        public static int perimeter(int a, int b){
            return Figure.perimeter(a, b);
        }


}
/*
1. Описать абстрактный класс фигура:
класс имеет свойство цвет, поведение рассчитать площадь, периметр.
2. Описать класс фигуру прямоугольник:
класс имеет поля длина, ширина, есть метод определения является ли прямоугольник квадратом.
3. Расширить класс абстрактным классом и реализовать все методы.
4. Описать интерфейс Drawable методом draw();
5. Реализовать интерфейс из задания 4 в классе из задания 3.
Метод draw() выводит строку в консоль с типом фигуры, размером сторон, площадью, периметром и цветом.
**Задание со звездочкой: Нарисовать в консоли фигуру с надписью цвета зеленый. Квадрат размером 1 на 10!
 */