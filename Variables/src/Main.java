public class Main {
    public void pupAge() {
        int age = 0;
        age = age + 7; //age is the local variable
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        SampleClass.printHello();
        SampleClass.printClassVariable1();
    }
}