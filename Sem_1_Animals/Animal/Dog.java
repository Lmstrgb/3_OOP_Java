//решил попробовать сделать наследника от Cat
public class Dog extends Cat {

  public Dog(String animal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws) {
    super(animal, ownerName, diagnosis, isVaccinated, countPaws);

  }

  public Dog() {
      this("Dog-Buldog", null, null, false, 4);
  }

  @Override
  public void swim() {
    System.out.println("Режим плавания для " + TYPE + " включён с ограничениями");
  }

}
