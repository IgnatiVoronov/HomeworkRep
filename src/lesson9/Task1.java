package lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Средняя (3 балла)
         *
         * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
         * Если список пуст, не делать ничего. Вернуть изменённый список.
         *
         * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
         */

        System.out.println(centeredList(listBuilder()));
    }


    private static ArrayList<Double> listBuilder() {
        ArrayList<Double> listOfNum = new ArrayList<>();
        String[] numbs;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String input = in.nextLine();


        if (input.isEmpty()) {
            return null;
        } else {
            numbs = input.split(" ");
            for (String s : numbs) {
                listOfNum.add(Double.valueOf(s));
            }
        }

        return listOfNum;
    }

    private static ArrayList<Double> centeredList(ArrayList<Double> arrayList) {
        double averageValue = 0;

        if (arrayList == null) {
            return null;
        } else {
            for (double d : arrayList) {
                averageValue += d;
            }
            averageValue /= arrayList.size();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.set(i, arrayList.get(i) - averageValue);
            }
            return arrayList;

        }
    }
}
