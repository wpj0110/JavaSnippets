public interface Design {
    void FillColor();
    int add(int a, int b);

    //int giveNum(){ //Everything within an interface is abstract therefore it can't have a body... unless it's static, default, or private
    //    return 1;
    //}

    static int giveNum(){ //this is possible
        return 1;
    }

    default int giveNum2(){ //this is possible
        return 1;
    }

    private int giveNum3(){ //this is possible
        return 1;
    }
}
