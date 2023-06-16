package lesson14.task1;

public class Task1 {
    public static void main(String[] args) {
       /* 1) Сделать задачу с философами, при условии, что за столом
        может сидеть только 1 философ, синхронизировать доступ к
        критической секции через synchronized
        */

        Cafe cafe = new Cafe();
        for (int i = 1; i < 6; i++) {

            Thread t = new Thread(new Philosopher(cafe));
            t.setName(String.valueOf(i));
            t.start();
        }
    }
}

class Cafe {
    //применим оператор synchronized к методу eating()
    synchronized public void eating() {

        try {
            System.out.println("Философ " + Thread.currentThread().getName() + " садится за стол");
            // философ ест
            Thread.sleep(500);

            System.out.println("Философ " + Thread.currentThread().getName() + " выходит из-за стола");

        } catch (InterruptedException e) {
            System.out.println("у философа " + Thread.currentThread().getName() + " проблемы со здоровьем");
        }
    }
}

// класс философа
class Philosopher extends Thread {
    Cafe cafe;
    int num;

    Philosopher(Cafe cafe) {
        this.cafe = cafe;
    }

    public void run() {
        // кол-во приемов пищи
        num = 0;
        while (num < 3) {// пока количество приемов пищи не достигнет 3
            cafe.eating();
            num++;
            try {
                // философ гуляет
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("у философа " + Thread.currentThread().getName() + " проблемы со здоровьем");
            }
        }

    }
}
