package package1;

public class Class1 {

    private void hello1(){ //can only be accessed within the class since it's private
        System.out.println("Hello1 from Class1");
    }

    void hello2(){
        hello1();
        System.out.println("Hello2 from Class1");
    }

    static void hello3(){
        System.out.println("Hello3 from Class1");
    }

    public void hello4(){
        System.out.println("Hello4 from Class1");
    }
    public static void hello5(){
        System.out.println("Hello5 from Class1");
    }
}
