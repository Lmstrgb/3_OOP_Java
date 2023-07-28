public class Duck extends Animal implements Soundable, flyable, Swimable{
    public Duck(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void fly(int sp) {
        System.out.println(getClass().getName() + " is flying");
    }

    @Override
    public void Swim(int sp) {
        System.out.println("Моя скорость плавания = " + sp);
    }
}
