package lab1;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        int x = in.nextInt();
        System.out.print("n: ");
        int n = in.nextInt();
        in.close();
        double power = x;
//      Если степень отрицательная выполнится следующая логика:
        if (n > 0) {
            int f =1;
//          цикл  while будет до тех пор, пока мы не достигнем значение желаемой степени
            while (f<n) {
//
                f++;
//              умножаем число само на себя, то есть возводим в степень
                power = power * x;
            }
        }
//      Если степень = 0, выведится единица
        if(n==0){
            power = 1;
        }
//      Если степень отрицательная выполнится следующая логика:
        if (n<0) {
            double one = 1;
            power = one/ x;
            int f =-1;
//          принцип работы цикла такой же как и в полложительной степени, только мы умножаем число на обратную дробь, так как степень отрицательная
            while (f>n) {
                f--;
                power = power * one/x;
            }
        }
//      Выводим итог
        System.out.println(power);
    }
}
