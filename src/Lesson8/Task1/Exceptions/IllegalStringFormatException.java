package Lesson8.Task1.Exceptions;

public class IllegalStringFormatException extends Exception{

    public IllegalStringFormatException(){
        System.out.println("Неверный формат строки!");
    }
}
