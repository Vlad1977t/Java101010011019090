package lab2;
import java.util.Scanner;
import java.util.regex.*;
public class tas2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");

        while (true) {
            if (in.hasNext()){
                String pass = in.next();
//              Задаем условия надежности пароля
                Pattern p1 = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})");
//              Сравниваем пароль с паттерном
                Matcher match1 = p1.matcher(pass);
                if (match1.matches()) {
                    System.out.println("Пароль надёжный");
                    System.exit(0);
                }
                else {

                    System.out.println("Пароль ненадёжный"+"\n"+"Повторите ввод");
                }
            }
        }
    }
}