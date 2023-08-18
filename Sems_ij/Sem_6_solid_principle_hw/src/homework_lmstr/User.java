package homework_lmstr;

public class User implements IPersister {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + getName());
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + getName());
    }
//    public void save() {
//        Persister persister = new Persister(this);
//        persister.save();
//    }

//    public void report() {
//        System.out.println("Report for user: " + name);
//    }
}
