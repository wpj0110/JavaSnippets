public interface Design {
    void FillColor();
    int add(int a, int b);

    //int giveNum(){ //Everything within an interface is abstract therefore it can't have a body... unless it's static
    //    return 1;
    //}

    static int giveNum(){ //this is possible
        return 1;
    }
}
