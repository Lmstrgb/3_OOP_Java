import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human implements doDiagnosis {

    private String speciality;
    private int experience;

  //  private List<Doctor> doctors;

    public Doctor(String name, String mailOrFemail, int age, String speciality, int  experience) {
        super(name, mailOrFemail, age);
        this.speciality = speciality;
        this.experience = experience;


    }


//    public Doctor(String name, String mailOrFemail,int age) {
//        super(name, mailOrFemail, age);
//        this.doctors = new ArrayList<>();
//    }

   /* public Doctor addNewDoctor(Doctor doc) {
        doctors.add(doc);
        return this;
    }

    public List<Doctor> getDocs() {
        return doctors;
    }*/




    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void doDiagnosis() {
        System.out.println("Доктор ставит диагноз");

    }


}
