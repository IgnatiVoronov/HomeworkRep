package Lesson13.Task1;

import java.util.Optional;

public class Task1 {
    /*
    1) Повторить пример с Optional по теме компьютера
    */
    public static void main(String[] args) {
        Optional<USB> usb = Optional.of(new USB("3.0"));
        Optional<Soundcard> soundcard = Optional.of(new Soundcard(usb));
        Optional<Computer> computer = Optional.of(new Computer(soundcard));

        String usbVersion = computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");

        System.out.println("Версия USB - " + usbVersion);
    }
}
