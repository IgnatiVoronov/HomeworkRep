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



       //задачи из lesson 2 и lesson 3
        /**
         * Пример
         *
         * Найти число корней квадратного уравнения ax^2 + bx + c = 0
         */
        numberOfRoots();


        /**
         * Простая (2 балла)
         *
         * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
         * вернуть строку вида: «21 год», «32 года», «12 лет».
         */
        getCorrectAge();
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


    //число корней квадратного уравнения
    public static void numberOfRoots(){

        int a;//
        int b;//  коэффициенты уравнения
        int c;//

        double d;//дискриминант

        Scanner in = new Scanner(System.in);
        System.out.print("Коэффициент a: ");
        a = in.nextInt();

        System.out.print("Коэффициент b: ");
        b = in.nextInt();

        System.out.print("Коэффициент c: ");
        c = in.nextInt();
        System.out.println("Уравнение: "+a+"x^2+"+b+"x+"+c+"=0");

        d=Math.pow(b,2)-4*a*c;

        if(d<0){
            System.out.println("Корней нет");
        }else if(d==0){
            System.out.println("Уравнение иеет один корень");
        }else{
            System.out.println("Уравнение иеет два корня");
        }
    }


    //подставить  к возрасту "год" "года" или "лет"
    public static void getCorrectAge(){
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст от 0 до 200: ");
        age = in.nextInt();

        if (age==1 || (age>20 && age%10==1)){
            System.out.println(age+" год");
        } else if(age%10==2 || age%10==3 || age%10==4){
            System.out.println(age+" года");
        }else{
            System.out.println(age+" лет");
        }
    }
}