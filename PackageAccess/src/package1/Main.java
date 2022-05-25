package package1;

import package2.Class3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Main Package 1");

        Class1 c1Obj = new Class1();
        //c1Obj.hello1(); //error. hello1() is private
        c1Obj.hello2(); //hello2 is not private
        Class1.hello3(); //doesn't need an object since hello3 is static.

        Class2.HelloTest();

        System.out.println("\nThe following below are from package2");
        Class3 c3Obj = new Class3();
        c3Obj.hello1();
        Class3.hello2();

        System.out.println("\nWe may use package components without importing the package itself.");
        package3.Class4.hello();

        Class5 c5Obj = new Class5();
        c5Obj.hello();
    }
}
