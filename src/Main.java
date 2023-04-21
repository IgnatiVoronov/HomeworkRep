import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        secPass(hours, minutes, seconds);

    }
    public static void secPass(int hours, int minutes, int seconds){
        int sum;

        sum = seconds+minutes*60+hours*3600;

        System.out.println(sum+" seconds have passed");
    }

}