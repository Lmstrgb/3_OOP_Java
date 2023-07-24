public class Bird extends Animal {
  Boolean predator;
  String typeOfEat;

  public Bird(String animal, String ownerName, String diagnosis, Boolean isVaccinated, boolean predator,
      String typeOfEat) {
    super(animal, ownerName, diagnosis, isVaccinated);
    this.predator = predator;
    this.typeOfEat = typeOfEat;

  }

  protected void toFly() {
    System.out.println("Режим полёта для " + TYPE + " включён");
  }

  @Override
  protected void swim() {
    System.out.println("Режим плавания для " + TYPE + " включить невозможно");
  }

}
