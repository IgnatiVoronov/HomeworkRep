package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    /**
     * 1) Написать класс, в котором будет 2 поля и при создании экземпляра такого
     * класса можно указать типы его полей (Аналог класса Pair<T, K> в котлин)
     * 2) Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
     * Напишите еще один метод, который выбирает из заполненного списка элемент наугад
     * 100000 раз. Замерьте время, которое потрачено на это. Сравните результаты и
     * предположите, почему они именно такие.
     * Также попробуйте в задании 2 создать лист, типизированным вашим Pair (доп задание, по желанию)
     */

    public static void main(String[] args) {
        ArrayList<ProductCatalog> catalogArrayList = new ArrayList<>();
        LinkedList<ProductCatalog> catalogLinkedList = new LinkedList<>();

        //зададим типы полей класса при его создании
        ProductCatalog<String, String> prod = new ProductCatalog<String, String>("s23445", "samsung S23");
        String id = prod.getId();
        String name = prod.getName();

        System.out.printf("Id: %s  Name: %s \n", id, name);
        System.out.println();

        //создаем списки на 1000000 элементов
        fillList(catalogArrayList);
        fillList(catalogLinkedList);

        //сравним время, затраченное на выбор 100000 элементов
        if (getFromTheList(catalogArrayList) > getFromTheList(catalogLinkedList)) {
            System.out.println("LinkedList быстрее");
        } else if (getFromTheList(catalogArrayList) < getFromTheList(catalogLinkedList)) {
            System.out.println("ArrayList быстрее");
        }

    }


    //метод, который добавляет 1000000 элементов в ArrayList, типизированный классом ProductCatalog
    public static void fillList(ArrayList<ProductCatalog> list) {
        for (int i = 0; i < 1000000; i++) {
            ProductCatalog<Integer, Integer> prod = new ProductCatalog<Integer, Integer>(i, i);
            list.add(prod);
        }
        System.out.println("List size - " + list.size());
    }

    //перегружаем метод, теперь он добавляет 1000000 элементов в LinkedList, типизированный классом ProductCatalog
    public static void fillList(LinkedList<ProductCatalog> list) {
        for (int i = 0; i < 1000000; i++) {
            ProductCatalog<Integer, Integer> prod = new ProductCatalog<Integer, Integer>(i, i);
            list.add(prod);
        }
        System.out.println("List size - " + list.size());
    }

    //метод, который выбирает из заполненного списка элемент наугад * 100000 раз
    private static long getFromTheList(ArrayList<ProductCatalog> list) {
        long startTime = System.currentTimeMillis();
        long spentTime;
        for (int i = 0; i < 100000; i++) {
            list.get((int) (Math.random() * 1000000));
        }
        //замерим потраченное время
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время для LinkedList - " + spentTime);
        return spentTime;
    }

    //метод, который выбирает из заполненного списка элемент наугад * 100000 раз
    private static long getFromTheList(LinkedList<ProductCatalog> list) {
        long startTime = System.currentTimeMillis();
        long spentTime;
        for (int i = 0; i < 100000; i++) {
            list.get((int) (Math.random() * 1000000));
        }
        //замерим потраченное время
        spentTime = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время для LinkedList - " + spentTime);
        return spentTime;
    }

}

//класс с двумя полями, типы полей задаются при создании класса
class ProductCatalog<I, N> {

    private I id;
    private N name;


    ProductCatalog(I id, N name) {
        this.id = id;
        this.name = name;

    }

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }
}
