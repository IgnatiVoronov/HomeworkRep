package Lesson13.Task1;

import java.util.Optional;

public class Soundcard {
    private Optional<USB> usb;

    Soundcard(Optional<USB> usb) {
        this.usb = usb;
    }

    public Optional<USB> getUSB() {
        return usb;
    }
}
