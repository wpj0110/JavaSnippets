package package1;

import java.awt.geom.PathIterator;

public class Main {
    public static void main(String[] args) {
        Engineer engObj = new Engineer();
        engObj.setSalary(78000); //From Engineer
        engObj.setFirstName("EngineerName"); //From Human
        engObj.setAge(29); //From Human

        System.out.println(engObj.defaultGetAge());
        System.out.println(engObj.protectedGetAge());
        System.out.println(engObj.publicGetAge());
        //System.out.println(engObj.privateGetAge()); //error

        Human humObj = new Engineer();
        //engObj2.setSalary(82000); //not possible: Superclass Human is used.
        humObj.setAge(22); //Components from Human class are okay.
        humObj.setFirstName("HumanName");
        //Engineer engObj2 = new Human(); //a subclass can't be a superclass of its superclass

        Engineer engObj2 = (Engineer) humObj; //this is allowed as long as Engineer is a subclass of Human
        System.out.println(engObj2.defaultGetAge()); //Attributes from before casting are still around.
        System.out.println(engObj2.publicGetName());

        //Doctor docObj = (Doctor) engObj; //not allowed
        Doctor docObj = new Doctor(new String[]{"Patient1", "Patient2","Patient3"});
        docObj.setAge(44);
        docObj.setFirstName("DocName");
        System.out.print("Patients are:");
        for(String patient: docObj.getPatients()){
            System.out.print(" "+patient);
        }

        System.out.print("\nhumanArr:");
        Human[] humanArr = {engObj,docObj};

        for(Human hum: humanArr) {
            System.out.print(" "+hum.publicGetName());
            //if (hum.publicGetName() == "DocName") {
            //    hum.getPatients(); //No longer possible since hum is of type Human, not Doctor
            //}
        }
    }
}