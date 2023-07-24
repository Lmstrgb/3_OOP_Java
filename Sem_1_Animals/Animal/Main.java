// Дз: добавить в класс Animal protected методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать. Причем, если допустим кошка не умеет летать, то она не должна этого делать.

// ОБЯЗАТЕЛЬНО: В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
// Ссылка на гитхаб проект

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();

        System.out.println(cat);

        Cat mursik = new Cat();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsik);

        System.out.println(animals);

        System.out.println(mursik.getType());
        System.out.println(mursik.getType("C arg "));
        cat.hunt();
        cat.toGo(); // вызывается из родительского класса
        cat.swim(); // вызывается из родительского класса
        System.out.println("==============================");
        Bird Canareyka = new Canary("Канарейка", "Симка", "Хромает", false, false, "Зерно", "жёлтая");
        Canareyka.toFly();
        Canareyka.toGo();
        Canareyka.swim();
        System.out.println(Canareyka);
        System.out.println("=============================");
        Animal Sobaka = new Dog();
        //Sobaka.toFly();
        Sobaka.toGo();
        Sobaka.swim();
        System.out.println(Sobaka);

        // Семинар 2
        // VetClinic clinic = new VetClinic();
        // clinic.addNewAnimal(pes).addNewAnimal(barsik);

        // for (Animal animal: clinic.getAnimals()) {
        // animal.ill();
        // }

        // musya.canRun(20);

    }
}