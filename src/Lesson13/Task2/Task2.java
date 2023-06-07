package Lesson13.Task2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Task2 {
    /*
    2) написать класс Phone, создать лист с его элементами.
    Hаписать функцию, которая на вход будет принимать тип сортировки
    (по дате, по цене) и вывести отсортированные элементы. Преобразования
    над элементами коллекции производить с помощью Stream API
    */
    public static void main(String[] args) {
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Collections.addAll(phoneArrayList,
                new Phone("Samsung", "Galaxy A54", new GregorianCalendar(2023, Calendar.MARCH, 1), 433),
                new Phone("Apple", "iPhone 14", new GregorianCalendar(2022, Calendar.SEPTEMBER, 7), 849),
                new Phone("Xiaomi", "Xiaomi 13 Lite", new GregorianCalendar(2023, Calendar.FEBRUARY, 26), 421),
                new Phone("Google", "Google Pixel 7", new GregorianCalendar(2022, Calendar.OCTOBER, 6), 600));

        System.out.println("Исходный лист: ");
        phoneArrayList.stream().forEach(System.out::println);

        //в данной реализации тип сортировки принимает конструктор
        //класса PhoneComparator который реализует интерфейс Comparator<T>
        System.out.println("\nСортеруем по дате: ");
        phoneArrayList.stream()
                .sorted(new PhoneComparator(TypeOfSort.RELEASE_DATE))
                .forEach(System.out::println);

        System.out.println("\nСортеруем по цене: ");
        phoneArrayList.stream()
                .sorted(new PhoneComparator(TypeOfSort.PRICE))
                .forEach(System.out::println);

    }

}

