package CodeChallenges.Challenge13;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateBrackets validateBrackets = new ValidateBrackets();
        String str;
        str="{}{Code}[Fellows](())";
        boolean boo = validateBrackets.validateBrackets(str);
        if (validateBrackets.validateBrackets(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");



    }

}
