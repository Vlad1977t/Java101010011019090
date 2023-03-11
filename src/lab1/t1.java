package lab1;
        import java.util.Scanner;
public class t1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("День рождения: ");
        int day = in.nextInt();

        if (day < 1 | day > 31) {
//          Выводим ошибку
            System.err.println("Введен неверный день");
//          Чтобы код дальше не продолжился выходим из системы со СТАТУСОМ 1(ошибочный статус)
            System.exit(1);
        }

        System.out.print("Месяц рождения: ");
        int month = in.nextInt();

        if (month < 1 | month > 12) {
            System.err.println("Введен неверный месяц");
            System.exit(1);
        }

        if (    (month == 2) & (day > 29) |
                (month == 4) & (day > 30) |
                (month == 6) & (day > 30) |
                (month == 9) & (day > 30) |
                (month == 11) & (day > 30)
        ) {
            System.err.println("В этом месяце меньше дней");
            System.exit(1);
        }

        System.out.print("Год рождения: ");
        int year = in.nextInt();
        in.close();

        if (year < 0 | year > 2022) {
            System.err.println("Введен неверный год");
            System.exit(1);
        }
        int currentDay = 9;
        int currentMonth = 3;
        int currentYear = 2023;
        if (month > currentMonth & day<currentDay) {
            System.out.println((currentYear - year - 1) + " лет" + ", " + (currentMonth) + " месяцев" + " и " + (currentDay - day + " дней"));
        }
        else if(month > currentMonth & day>currentDay){
            System.out.println((currentYear - year - 1) + " лет" + ", " + (currentMonth) + " месяцев" + " и " + (day-currentDay + " дней"));
        }
        else if (day > currentDay) {
            System.out.println((currentYear - year) + " лет" + ", " + (currentMonth - month) + " месяцев" + " и " + (currentDay + " дней"));
        }
        else if ((day==currentDay)|(month<currentMonth)) {
            System.out.println((currentYear - year) + " лет" + ", " + (currentMonth - month) + " месяцев" + " и " + (currentDay - day + " дней"));
        }
    }
}