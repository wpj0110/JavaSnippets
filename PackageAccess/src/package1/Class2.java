package package1;

class Class2 { //this is a default class. Accessible within the same package, but not outside
    public static void HelloTest(){
        System.out.print("Using Class2, accessing Class1: ");
        Class1.hello3();
        System.out.print("Using Class2, accessing Class1: ");
        Class1.hello5();
        Class1 c1obj1 = new Class1();
        System.out.print("Using Class2, accessing Class1: ");
        c1obj1.hello4();

        System.out.println("This is within Class2...");
        Class2.protectedHello();
    }

    protected static void protectedHello(){ //accessible ONLY within the same package (because of protected)
        System.out.println("Class2 protectedHello");
    }
}
