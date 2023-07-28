public class Fish extends Animal implements Swimable{
    public Fish(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void Swim(int speed) {
        System.out.println("Моя скорость плавания " + speed);
    }
}
