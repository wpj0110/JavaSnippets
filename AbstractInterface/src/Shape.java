public abstract class Shape {
    int returnNumber(){ //Not everything has to be abstract
        return 1234;
    }
    abstract void method1();
    abstract int Area(int a, int b); //notice that this will not work for circle.
}
