package Lesson13.Task2;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {
    private final TypeOfSort type;

    PhoneComparator(TypeOfSort type) {
        this.type = type;
    }

    public int compare(Phone a, Phone b) {

        switch (type) {
            case COMPANY -> {
                return a.getCompany().toUpperCase().compareTo(b.getCompany().toUpperCase());
            }
            case NAME -> {
                return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
            }
            case RELEASE_DATE -> {
                return a.getReleaseDate().compareTo(b.getReleaseDate());
            }
            case PRICE -> {
                return Integer.compare(a.getPrice(), b.getPrice());
            }
            default -> {
                return 0;
            }
        }

    }
}
