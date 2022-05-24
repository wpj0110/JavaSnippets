public class Triangle extends Shape implements Design, Rocket{

    //notice that it will need everything from the Design Interface and the Shape Abstract class.
    @Override
    public void FillColor() {
        System.out.println("Coloring the triangle as green");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    void method1() {
        System.out.println("Shape is Triangle.");
    }

    @Override
    int Area(int l1, int l2) {
        return l1*l2/2;
    }

    @Override
    public void enableBoosters() {
        System.out.println("Triangle Rocket Boosters Initiated");
    }
}
