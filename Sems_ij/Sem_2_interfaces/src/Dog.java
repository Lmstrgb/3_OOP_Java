public class Dog extends Animal implements Soundable, Swimable, Runable {
    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void Run(int sp) {
        System.out.println("Моя скорость бега = " + sp);
    }

    @Override
    public void Swim(int sp) {
        System.out.println("Моя скорость плавания = " + sp);

    }
}