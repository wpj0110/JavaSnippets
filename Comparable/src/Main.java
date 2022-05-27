import java.util.*;
import java.util.stream.Collectors;

class Age implements Comparable<Age>{
    private final int value;

    public Age(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Age o) {
        return Integer.compare(value, o.value);
    }

}

// do not change the code below
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Trying giving out the inputs: 5 12 7 17 4 8
        List<Age> list = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .mapToObj(Age::new)
                .sorted()
                .collect(Collectors.toList());

        //output should be in this order: 4, 5, 7, 8, 12, 17
        for(Age age : list){
            System.out.println(age.getValue());
        }

    }
}