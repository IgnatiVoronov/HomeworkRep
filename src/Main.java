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


        /**
         * Простая (2 балла)
         *
         * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
         * и t3 часов — со скоростью v3 км/час.
         * Определить, за какое время он одолел первую половину пути?
         */
        timeInPath();


        /**
         * Пример
         *
         * Проверка числа на простоту -- результат true, если число простое
         */
        simpleInt();


        /**
         * Пример
         *
         * Найти число вхождений цифры m в число n
         */
        mInM();


        /**
         * Простая (2 балла)
         *
         * Найти количество цифр в заданном числе n.
         * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
         *
         * Использовать операции со строками в этой задаче запрещается.
         */
        numberOfDigit();
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


    //время потраченное на половину пути
    public static void timeInPath(){
        int t[] = new int[3];   //t1 - 13
        int v[] = new int[3];   //v1 - v3
        int s[] = new int[3];   //s1 - s3
        double path = 0;        //весь путь
        double halfPath = 0;    //половина пути
        double timeInP = 0;  //время за первую половину пути

        Scanner in = new Scanner(System.in);
        for(int i=0;i<t.length; i++){
            System.out.print("Введите значение t"+(i+1)+": ");
            t[i] = in.nextInt();
            timeInP += t[i];
        }

        for(int i=0;i<t.length; i++){
            System.out.print("Введите значение v"+(i+1)+": ");
            v[i] = in.nextInt();
            s[i] = v[i]*t[i];
            path += (v[i]*t[i]);
        }

        halfPath=path/2;

        if (halfPath<=s[0]){
            timeInP = v[0]/halfPath;
            System.out.println("Время в пути: "+timeInP);
        } else if (halfPath>s[0] && halfPath<=(s[0]+s[1])) {
            timeInP = t[0] + v[1]/(halfPath-s[0]);
            System.out.println("Время в пути: "+timeInP);
        }else {
            timeInP = t[0]+t[1]+v[2]/(halfPath-(s[0]+s[1]));
            System.out.println("Время в пути: "+timeInP);
        }
    }


    //простые числа
    public static void simpleInt(){
        int num;
        boolean simple = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = in.nextInt();

        if(num<2) {
            simple = false;
            System.out.println(simple);
        }else{
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num%i==0){
                    simple = false;
                    break;
                }
            }
            System.out.println(simple);
        }
    }


    //число вхождений цифры m в число n
    public static void mInM(){
        String n;
        String m;

        int countM = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.next();

        System.out.print("Введите цифру m: ");
        m = in.next();

        for(int i=0; i<n.length();i++){
            if(m.equals(String.valueOf(n.charAt(i)))){
                countM++;
            }
        }
        System.out.println("Число вхождений цифры m в число n: "+countM);
    }


    //количество цифр в числе
    public static void numberOfDigit(){
        int num;

        int numberOfD = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = in.nextInt();

        for(int i=10; i<=num*10; i*=10){
            if(num/i<1){
                break;
            }else{
                numberOfD++;
            }
        }
        System.out.println("Колличество цифр: "+numberOfD);
    }
}


