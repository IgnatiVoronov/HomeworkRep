public class Crocodile extends Animal implements AnimalSound{
    Crocodile(){ super(); }
    Crocodile(String color,int age,int weight){
        super(color, age, weight);
    }
    @Override
    public void animalMoving() {
        System.out.println("Крокодил ползет");
    }

    @Override
    public void animalSound() {
        System.out.println("Гр-р-р");
    }
}
