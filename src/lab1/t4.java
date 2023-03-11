package lab1;

import java.util.Scanner;

public class t4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int kol_vo = in.nextInt();
        System.out.print("Рудиус окружности: ");
        float radius = in.nextFloat();
        int counter=0;
        for (int i = 1; i <= kol_vo; i++) {
//      Получаем координаты Х точек
            System.out.print("X ");
            System.out.print(i+" точки: ");
            float x = in.nextFloat();
//      Получаем координаты У точек
            System.out.print("Y ");
            System.out.print(i+" точки: ");
            float y = in.nextFloat();
            if ((x <= radius&&y<=radius)) {
                counter += 1;
            }
        }
        System.out.println(counter + " точек попали в окружность");
        in.close();
    }
}
