public class Snake extends Animal {
  Boolean poison;  

    public Snake(String animal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws, boolean poison) {
        super(animal, ownerName, diagnosis, isVaccinated);
        this.poison=poison;
      

    }

    
  }
