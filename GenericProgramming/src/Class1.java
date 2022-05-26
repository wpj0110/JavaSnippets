public class Class1<T> {

    private T t;

    public Class1(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public void sett(T t){
        this.t = t;
    }
}
