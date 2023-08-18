package homework_lmstr;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Operator operator= new Operator("Jon", "electric");
        //Persister persister = new Persister(user);
        //Persister persister1 = new Persister(operator);

        user.report();
        user.save();
        operator.report();
        operator.save();

    }
}