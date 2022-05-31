import java.util.Scanner;

public class Main {
    static StringBuilder selection = new StringBuilder("0123456789abcdefghijklmnopqrstuvwxyz");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder randCode;

        System.out.println("Input the length of the secret code: ");
        int size = sc.nextInt();

        if (size > 36) {
            System.out.println("Error: can't generate a secret code with a length of " + size + " because there aren't enough unique symbols.");
            System.exit(1);
        }

        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols = sc.nextInt() - 1;

        if (possibleSymbols > 36) {
            System.out.println("Error: can't generate a secret code with a possible symbols of " + possibleSymbols + " because there aren't enough unique symbols.");
            System.exit(1);
        }

        char lastSymbol = selection.charAt(possibleSymbols);

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
        return (bulls == code.length());
    }
}
