package newlight;

import static newlight.Rectangle.GREEN;
import static newlight.Rectangle.ifIsSquare;

public interface Drawable {
 static void draw(int square, int perimeter, int length, int width) {
        System.out.println("Фигура: " + ifIsSquare(length,width));
        System.out.println("Длина: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Площадь равна: "+ square);
        System.out.println("Периметр равен: "+ perimeter);
        System.out.println("Цвет: зеленый ");

        for(int i=0; i<10; i++){
            System.out.print(GREEN + "-" );
        }
        System.out.print(GREEN +"\n|" + "        " +"|" + " зеленый" + "\n");
        for(int i=0; i<10; i++){
            System.out.print(GREEN + "-");
        }
    }

}
