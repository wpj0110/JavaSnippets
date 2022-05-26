public class Main {
    public static void main(String[] args) {
        Class1<String> obj1 = new Class1<>("Blah");
        Class1<Integer> obj2 = new Class1<>(100);

        System.out.println(obj1.get()); //prints Blah
        System.out.println(obj2.get()); //prints 100

        String word = obj1.get();


        Class1 obj3 = new Class1("cookie"); //object type is unspecified so by default, it is of type "Object"
        System.out.println(obj3.get()); //prints cookie
        //String word2 = obj3.get(); //will not work
        String word2 = (String) obj3.get();
        //Integer num1 = obj3.get(); //compile-time error
        System.out.println(word2); //prints cookie
        //Integer num1 = (Integer) obj3.get(); //Will give runtime error. Undetected on compilation.
        //System.out.println(num1);
    }
}