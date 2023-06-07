package Lesson13.Task2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Phone {
    private String company;
    private String name;
    private GregorianCalendar releaseDate;
    private int price;


    Phone(String company, String name, GregorianCalendar releaseDate, int price) {
        this.company = company;
        this.name = name;
        this.releaseDate = releaseDate;
        this.price = price;

    }

    @Override
    public String toString() {
        return company + " | " + name + " | " + new SimpleDateFormat("dd MMMM y").format(releaseDate.getTime()) + " | " + price + "$";
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

}
