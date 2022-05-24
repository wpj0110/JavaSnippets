public class SampleClass {
    String firstName; //instance variable
    private int age; //instance variable
    public float money; //instance variable

    public static void printHello() { System.out.println("hello from SampleClass");} //instance method

    /*Fields that have the static modifier in their declaration are called static fields or class variables.
    They are associated with the class, rather than with any object. Every instance of the class shares
    a class variable, which is in one fixed location in memory. Any object can change the value of a class
    variable,but class variables can also be manipulated without creating an instance of the class.
    * */

    static int num1 = 4; //Class Variable
    int num2 = 10;

    public static void printClassVariable1() { System.out.println(num1);}
    //public static void printClassVariable2() { System.out.println(num2);} //Error here since num2 isn't static
}
