import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinica clinic = new VetClinica();
        clinic.addNewAnimal(new Cat("Barsik", "Nikolai")).addNewAnimal(new Dog("Pushok", "Oleg")).addNewAnimal(new Fish("Золотая1", "Олег"));
        clinic.addNewAnimal(new Duck("Donald", "Alena"));

        //Д.з. к семинару 2
        System.out.println("Все летающие звери");
        for (Animal animal : clinic.getFlyingAnimals()) {
            System.out.println("Имена летающих " + animal.getName());
        }
        System.out.println("Все плавающие звери");
        for (Animal animal : clinic.getSwimableAnimals()) {
            System.out.println("Имена плавающих " + animal.getName());
        }
        System.out.println("Все бегающие звери");
        for (Animal animal : clinic.getRunableAnimals()) {
            System.out.println("Имена " + animal.getName());
        }
        System.out.println("Все бегающие звери");
        for (Animal animal : clinic.getRunableAnimals()) {
            System.out.println("Имена бегающих " + animal.getName());
        }
        System.out.println("Все говорящие звери");
        for (Animal animal : clinic.getSoundableAnimals()) {
            System.out.println("Имена говорящих " + animal.getName());
        }
        //Со списком как делалось выше на семинаре не получилось. Хотел в VetClinica сделать список, в котором был бы персонал клиники

        Doctor Doc = new Doctor("Егорова Нина Семёновна", "жен", 51, "Veterinar", 10);
        Doctor Doc1 = new Doctor("Старостин Игорь Витальевич", "муж", 45, "Veterinar", 5);
        Nurse Nurse1 = new Nurse("Андреева Гульнара Сергеевна", "жен", 37, "Cat_1", 4);
        //Doc.addNewDoctor(new Doctor("Старостин Игорь Витальевич", "муж", 45)).addNewDoctor(new Doctor("Алимов Тимур Раисович", "муж", 37));
        System.out.println(Doc1.getExperience());
        Doc1.doDiagnosis();
        Nurse1.doInjection();
        Fish F = new Fish("Золотая", "Олег");
        F.Swim(10);

        VetClinicaPersonal pers = new VetClinicaPersonal();
        //pers.addNewPerson(new Doctor("Barsik", "Nikolai")).addNewAnimal(new Dog("Pushok", "Oleg")).addNewAnimal(new Fish("Золотая1", "Олег"));
        pers.addNewPerson(Doc1).addNewPerson(Nurse1);

        System.out.println("===================");
        for (Human human : pers.getHuman()) {
            System.out.println("Персонал: " + human.getName());
        }
        //System.out.println(pers.getHuman());

    }
}

