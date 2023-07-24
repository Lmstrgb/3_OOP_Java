public class Canary extends Bird {
  String colour;

  public Canary(String animal, String ownerName, String diagnosis, Boolean isVaccinated,
      boolean predator, String typeOfEat, String colour) {
    super(animal, ownerName, diagnosis, isVaccinated, predator, typeOfEat);
    this.colour = colour;

  }
}
