package package1;

public class Human {
    private int age;
    private String firstName;

    protected void setAge(int age){
        this.age = age;
    }

    void setFirstName(String firstName){ //this is default
        this.firstName = firstName;
    }

    private int privateGetAge(){
        return this.age;
    }

    protected int protectedGetAge(){
        return this.age;
    }

    public int publicGetAge(){
        return this.age;
    }

    public String publicGetName() {
        return this.firstName;
    }

    int defaultGetAge(){
        return this.age;
    }

}
