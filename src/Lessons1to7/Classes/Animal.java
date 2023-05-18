package Lessons1to7.Classes;

public abstract class Animal {

    private String color;
    private int age;
    private int weight;

    //конструктор без параметров
    Animal(){
        color="Серый";
        age=0;
        weight=0;
    }
    //конструктор инициализирует все поля
    Animal(String color, int age, int weight){
        this.setColor(color);
        this.setAge(age);
        this.setWeight(weight);
    }

    //гетеры и сетеры
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    //абстрактный метод
    public abstract void animalMoving();

    //переопределяем toString
    @Override
    public String toString() {
        return "Цвет - "+color+"\nВозраст - "+age+"\nВес - "+weight;
    }

    //переопределяем equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal that = (Animal) obj;
        if(this.color==that.color && this.age==that.age && this.weight== that.weight){
            return true;
        }
        return false;
    }

    //переопределяем hashCode
    @Override
    public int hashCode() {
        int result = color == null ? 0 : color.hashCode();
        result = 31 * result + age;
        result = 31 * result + weight;
        return result;
    }
}
