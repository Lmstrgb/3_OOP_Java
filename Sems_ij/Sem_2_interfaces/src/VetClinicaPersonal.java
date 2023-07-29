import java.util.ArrayList;
import java.util.List;

public class VetClinicaPersonal {
    private List<Human> personal;

    public VetClinicaPersonal() {
        this.personal = new ArrayList<>();
    }

    public VetClinicaPersonal addNewPerson(Human human) {
        personal.add(human);
        return this;
    }


    public List<Human> getHuman() {
        return personal;
    }

}
