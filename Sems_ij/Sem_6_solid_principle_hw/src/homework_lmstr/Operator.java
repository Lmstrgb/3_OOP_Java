package homework_lmstr;

public class Operator extends User{
    private final String profession;

    public Operator(String name, String profession) {
        super(name);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public void save() {
        System.out.println("Save operator: " + getName());
        System.out.println("Save operator: " + getProfession());
    }

    @Override
    public void report() {
        //super.report();
        System.out.println("Report operator: " + getName());
        System.out.println("Report operator: " + getProfession());
    }
}
