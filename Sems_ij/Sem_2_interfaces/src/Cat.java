public class Cat extends Animal implements Soundable, Illable, Runable{
    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }


    @Override
    public void Run(int speed) {
        System.out.println("Моя скорость " + speed);

    }
}
