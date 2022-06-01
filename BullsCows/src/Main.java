import java.util.Scanner;

public class Main {
    static StringBuilder selection = new StringBuilder("0123456789abcdefghijklmnopqrstuvwxyz");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder randCode;

        int size = codeLength();

        int possibleSymbols = symbolCount(size);

        char lastSymbol = selection.charAt(possibleSymbols - 1);

        randCode = gen(size, possibleSymbols);
        System.out.println("The secret is prepared: " + "*".repeat(size) + " (0-" + (possibleSymbols > 10 ? ("9, " + "a-"+lastSymbol+").") : lastSymbol+")."));

        System.out.println("Okay, let's start a game!");

        boolean done;
        int turnCount = 1;
        do {
            System.out.println("Turn "+ turnCount++ +":");
            StringBuilder guess = new StringBuilder(sc.next());
            done = matcher(randCode,guess);
        } while(!done);
        System.out.println("Congratulations! You guess the secret code.");
    }

    public static Integer codeLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the secret code: ");
        String input = sc.next();

        try {
            if (Integer.parseInt(input) <= 0) {
                throw new Exception("Error: Length of the secret code must be greater than or equal to 1");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: "+ input + " isn't a valid number");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            System.exit(1);
        }
        return Integer.parseInt(input);
    }

    public static Integer symbolCount(int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of possible symbols in the code:");
        String input = sc.next();
        try {
            int temp = Integer.parseInt(input);
            if (Integer.parseInt(input) <= 0) {
                throw new Exception("Error: Length of the secret code must be greater than or equal to 1");
            } else if (temp < size){
                throw new ArithmeticException("Error: it's not possible to generate with a code with a length of " + size + " with " + input +" unique symbols");
            } else if (temp > 36) {
                throw new Exception("Error: maximum number of possible symbols in the code is 36 (0-9, a-z)");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: "+ input + " isn't a valid number");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            System.exit(1);
        }
        return Integer.parseInt(input);
    }
    public static StringBuilder gen(int size, int possibleSymbols){
        StringBuilder randomCode = new StringBuilder();
        while (size != 0){
            int idx = (int) (Math.random() * (possibleSymbols));
            if (randomCode.length() != 0){
                randomCode.append(selection.charAt(idx));
                selection.deleteCharAt(idx);
                possibleSymbols -= 1;
                size -= 1;
            } else {
                if (idx != 0){
                    randomCode.append(selection.charAt(idx));
                    selection.deleteCharAt(idx);
                    possibleSymbols -= 1;
                    size -= 1;
                }
            }
        }
        return randomCode;
    }

    public static boolean matcher(StringBuilder code, StringBuilder guess) {
        int bulls = 0, cows = 0;
        try {
            for (int i = 0; i < code.length(); i++){
                if (code.charAt(i) == guess.charAt(i)){
                    bulls += 1;
                    continue;
                }
                for (int j = 0; j < code.length(); j++){
                    if (code.charAt(j) == guess.charAt(i)){
                        cows += 1;
                        break;
                    }
                }
            }
            System.out.print("Grade:");
            if (bulls > 0) {
                System.out.print(" "+bulls + (bulls == 1 ? " bull" : " bulls"));
            }

            if (cows > 0) {
                if (bulls > 0) {
                    System.out.print(" and");
                }
                System.out.print(" "+ cows + (cows == 1 ? " cow" : " cows"));
            }
            if (cows == 0 && bulls == 0){
                System.out.print(" None");
            }
            System.out.println();

        } catch(IndexOutOfBoundsException e) {
            System.out.println("Grader Error: Guess is of length " + guess.length() + ". It must be of length " + code.length() +".");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Grader Error: "+e.getMessage());
            System.exit(1);
        }
        return (bulls == code.length());
    }
}
