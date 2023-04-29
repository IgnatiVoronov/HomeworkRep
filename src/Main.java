import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Тривиальная (3 балла).
         *
         * Задача имеет повышенную стоимость как первая в списке.
         *
         * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
         * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
         */

       getSec();

    }

    //подсчет секунд
    public static void secPassCalk(int hours, int minutes, int seconds){
        int sum;

        sum = seconds+minutes*60+hours*3600;

        System.out.println(sum+" seconds have passed");
    }

    public static void getSec(){
        int hours;
        int minutes;
        int seconds;

        Scanner in = new Scanner(System.in);
        System.out.print("Hours ");
        hours = in.nextInt();

        System.out.print("Minutes ");
        minutes = in.nextInt();

        System.out.print("Seconds ");
        seconds = in.nextInt();

        secPassCalk(hours, minutes, seconds);
    }

}