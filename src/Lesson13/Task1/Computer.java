package Lesson13.Task1;

import java.util.Optional;

public class Computer {
    private Optional<Soundcard> soundcard;

    Computer(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }

    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }
}
