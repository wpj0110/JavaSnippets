package package1;

public class Doctor extends Human {

    private String[] patients;

    public Doctor(String[] patients) { //constructor
        this.patients = patients;
    }

    public String[] getPatients(){
        return this.patients;
    }
}
