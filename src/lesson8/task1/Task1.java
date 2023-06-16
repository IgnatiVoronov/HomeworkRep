package lesson8.task1;

import lesson8.task1.Exceptions.IllegalStringFormatException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IllegalStringFormatException {
        /** Сложная (6 баллов)
         *
         * Строка содержит названия товаров и цены на них в формате вида
         * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
         * То есть, название товара отделено от цены пробелом,
         * а цена отделена от названия следующего товара точкой с запятой и пробелом.
         * Вернуть название самого дорогого товара в списке (в примере это Курица),
         * или пустую строку при нарушении формата строки.
         * Все цены должны быть больше нуля либо равны нулю.
         * В случае неверной строки выкинуть свое исключение.
         */


        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = in.nextLine();

        System.out.println(mostExpensiveItemFinder(input));

    }

    public static String mostExpensiveItemFinder(String input) throws IllegalStringFormatException {
        String mostExpensiveItem = "";
        double maxPrise = -1;
        //сравниваем строку с шаблоном
        if (!input.matches("([а-яА-Я]+ \\d+\\.?\\d+; )*([а-яА-я]+ \\d+\\.?\\d+)")) {
            throw new IllegalStringFormatException();
        }

        Pattern pattern = Pattern.compile("([а-яА-Я]+) (\\d+\\.?\\d+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(2));
            String item = matcher.group(1);

            if (price > maxPrise) {
                maxPrise = price;
                mostExpensiveItem = item;
            } else if (price == maxPrise){
                mostExpensiveItem = mostExpensiveItem+", "+item;
            }
        }
        return mostExpensiveItem;
    }
}
