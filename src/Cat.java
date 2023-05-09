public class Cat extends Animal implements AnimalSound{
    Cat(){ super(); }
    Cat(String color,int age,int weight){
        super(color, age, weight);
    }
    @Override
    public void animalMoving() {
        System.out.println("Кот бежит");
    }

    @Override
    public void animalSound() {
        System.out.println("Мяу");
    }
}
