public class Nurse extends Human implements doInjection {
    private String category;
    private int experience;

    public Nurse(String name, String mailOrFemail, int age, String category, int  experience) {
        super(name, mailOrFemail, age);
        this.category = category;
        this.experience = experience;


    }

    @Override
    public void doInjection() {
        System.out.println(getClass().getName() + " делает укол");
    }
}
