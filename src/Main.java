import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number;

        for(;;) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter the number from 100 to 2147483647 or STOP ");
            number = in.next();

            //System.out.println(number.equals("STOP"));

            if(number.equals("STOP")){
                System.out.println("Bye!");
                break;
            }else if(errorFinder(number)) {
                System.out.println("You have entered an invalid character - please try again.");
            }else thirdDigit(number);
        }


    }

    //проверка наличия иных символов кроме цифр
    public static boolean errorFinder(String integ){
        boolean errorFlag = false;

        for (int i=0;i<integ.length();i++){
            if(((int)integ.charAt(i))<48 || ((int)integ.charAt(i))>57){
                errorFlag = true;
                break;
            }else errorFlag=false;
        }
        return errorFlag;
    }

    //поиск нужной цифры
    public static void thirdDigit(String integ){

        char digit;

        digit = integ.charAt(integ.length()-3);

        System.out.println("Third digit from the right - "+digit);
    }
}