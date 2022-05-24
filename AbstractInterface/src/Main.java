
public class Main {
    public static void main(String[] args) {
        Rectangle rectObj = new Rectangle();
        Circle circleObj = new Circle();

        System.out.println("Using Abstract classes: ");
        System.out.println(rectObj.returnNumber()); //1234
        System.out.println(circleObj.returnNumber()); //1234
        System.out.println("Area of rectangle with L: 3, W: 4 = "+rectObj.Area(3,4)); // 12

        System.out.println();
        System.out.println("Using an Interface: ");
        Chicken chickenObj = new Chicken();
        chickenObj.FillColor(); //Coloring the chicken as brown

        System.out.println();
        System.out.println("Using an Interface with an Abstract class");
        Triangle triangleObj = new Triangle();
        triangleObj.method1(); //Shape is Triangle
        triangleObj.FillColor(); //Coloring the triangle as green
        System.out.println("Area of a triangle with L1: 4, L2: 3 = "+triangleObj.Area(4,3)); // 6
        triangleObj.enableBoosters();
    }
}