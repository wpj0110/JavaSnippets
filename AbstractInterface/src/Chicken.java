public class Chicken implements Design{ //the class doesn't need to have a relationship with the interface.
                                        //It may use the interface as a skeleton for guidance.
    @Override
    public void FillColor() {
        System.out.println("Coloring the chicken as brown");
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
