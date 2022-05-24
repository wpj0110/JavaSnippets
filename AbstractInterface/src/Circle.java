public class Circle extends Shape{
    @Override
    void method1() {
        System.out.println("Shape is Circle");
    }

    @Override
    int Area(int a, int b) { //has to be this format
        return 0;
    }

    //@Override
    //int Area(int r) { //has errors if it doesn't follow the format
    //    return 2*3*r;
    //}
}
