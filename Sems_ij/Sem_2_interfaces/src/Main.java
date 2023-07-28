import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinica clinic = new VetClinica();
        clinic.addNewAnimal(new Cat("Barsik", "Nikolai")).addNewAnimal(new Dog("Pushok", "Oleg")).addNewAnimal(new Fish("Золотая1", "Олег"));

        for (Animal animal : clinic.getAnimals()) {
            animal.ill();
        }

        //Со списком как делалось выше на семинаре не получилось. Хотел в VetClinica сделать список, в котором был бы персонал клиники

        Doctor Doc = new Doctor("Егорова Нина Семоновна", "жен", 51, "Veterinar", 10);
        Doctor Doc1 = new Doctor("Старостин Игорь Витальевич", "муж", 45, "Veterinar", 5);
        Nurse Nurse1 = new Nurse("Старостин Игорь Витальевич", "муж", 45, "Veterinar", 5);
        //Doc.addNewDoctor(new Doctor("Старостин Игорь Витальевич", "муж", 45)).addNewDoctor(new Doctor("Алимов Тимур Раисович", "муж", 37));
        System.out.println(Doc1.getExperience());
        Doc1.doDiagnosis();
        Nurse1.doInjection();
        Fish F = new Fish("Золотая", "Олег");
        F.Swim(10);

    }
}

