package lesson8.task2;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IllegalArgumentException {
        /** Сложная (6 баллов)
         *
         * В строке представлено выражение вида "2 + 31 - 40 + 13",
         * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
         * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
         * Вернуть значение выражения (6 для примера).
         * Про нарушении формата входной строки бросить исключение IllegalArgumentException
         */


        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = in.nextLine();

        System.out.println(sumOfNumbers(input));

    }

    public static int sumOfNumbers(String input) throws IllegalArgumentException {
        int sumOfNum = 0;
        //проверяем строку на верность формата
        if (!input.matches("(\\d+ [+-] )*(\\d+)")) {
            throw new IllegalArgumentException();
        }

        Pattern pattern = Pattern.compile("(\\d+)");    //здесь ищем числа
        Pattern pattern1 = Pattern.compile("([+-])");   //здесь ищем знаки
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);

        int[] nums = new int[input.length() / 2];               //массив для чисел
        String[] symb = new String[input.length() / 2];        //массив для знаков
        int count = 0;
        while (matcher.find()) {                            //заполняем массив числами
            nums[count] = Integer.parseInt(matcher.group(1));
            count++;
        }
        count = 0;
        while (matcher1.find()) {                           //заполняем массив знаками
            symb[count] = matcher1.group(1);
            count++;
        }
        sumOfNum = nums[0];
        for (int i = 0; i < nums.length; i++) {                    //решаем выражение
            if (Objects.equals(symb[i], "+")) {
                sumOfNum += nums[i + 1];
            } else if (Objects.equals(symb[i], "-")) {
                sumOfNum -= nums[i + 1];
            }
        }

        return sumOfNum;
    }


}

class IllegalArgumentException extends Exception {
    public IllegalArgumentException() {
        System.out.println("Неверный формат строки!");
    }

}
