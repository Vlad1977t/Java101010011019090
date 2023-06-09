package lab2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tas1 {
    public static void main(String[] args) {
        System.out.print("Введите дату: ");
        Scanner in = new Scanner(System.in);
        String date = in.next();
        in.close();
        Pattern p1 = Pattern.compile("([0-9]|1[0-9]|2[0-9]|3[0-1])/([0-9]|1[0-2])/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))");
//      Проверяем встречаются ли точки в формате даты
        Pattern p2 = Pattern.compile("(?=.*\\.)");
        Matcher m1 = p1.matcher(date);
        Matcher m2 = p2.matcher(date);

        if((m1.matches())&(!m2.find())){
            System.out.println("Введенное выражение является датой");
        }
        if (m2.find()){
            System.err.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        else {
            System.err.println("Введенное выражение не является датой");
        }
    }
}
