public class Main {
    public static void main(String[] args) {

        //example of primitive types
        int intNum1 = 40;
        int intNum2 = 40;
        long longNum1 = 300L;
        long longNum2 = 300L;

        //example of reference types
        Integer refInt1 = 40;
        Integer refInt2 = 40;
        Long refLong1 = 300L;
        Long refLong2 = 300L;

        System.out.println("longNum1 == longNum2: "+ (longNum1 == longNum2));
        System.out.println("longNum1 == refLong1: "+ (longNum1 == refLong1));
        System.out.println("refLong1 == refLong2: "+ (refLong1 == refLong2));
        System.out.println("False because they point to different REFERENCES");
        System.out.println("Long.valueOf(refLong1).equals(Long.valueOf(refLong2))): "+ (Long.valueOf(refLong1).equals(Long.valueOf(refLong2))));
        System.out.println("(Long.valueOf(refLong1).equals(longNum1)): "+ (Long.valueOf(refLong1).equals(longNum1)));

        Integer dummyInt = null;
        //int dummyInt2 = null; //not possible
        //int dummyInt3 = dummyInt; //Throws NullPointerException
        dummyInt = 50;

        int dummyInt4 = 75;
        dummyInt = dummyInt4; //boxing
        //dummyInt = Integer.valueOf(dummyInt4); //boxing. this is also acceptable

        System.out.println(dummyInt); //prints 75

        int dummyInt6 = dummyInt; //unboxing
        dummyInt = 40; //This will NOT change dummyInt6 to 40
        System.out.println(dummyInt6); //prints 75

    }
}