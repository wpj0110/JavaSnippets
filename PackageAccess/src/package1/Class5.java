package package1;

public class Class5 extends Class2{
    void hello(){
        System.out.println("\nWithin Class5 extends Class2 within same package...");
        System.out.print("Protected: ");
        protectedHello();
        System.out.print("Default: ");
        defaultHello();
        System.out.print("Public: ");
        HelloTest();
    }
}
