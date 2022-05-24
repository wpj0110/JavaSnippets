package package2;

import package1.Class1;

public class Class3 { //note: if this is a protected class, Main class from class 1 won't be able to access this.
    public void hello1(){
        System.out.println("Hello1 from Package 2 Class3");
    }
    public static void hello2(){
        System.out.println("Hello2 from Package 2 Class3");
        System.out.print("From Package 2 Class3: ");
        Class1.hello5(); //
        System.out.print("From Package 2 Class3: ");
        Class1 c1Obj = new Class1();
        c1Obj.hello4();
    }
}
