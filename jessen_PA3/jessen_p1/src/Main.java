import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {

            System.out.println("Please enter number 1, 2, 3, 4 or 5 to select a type of arithmetic problem (1 = addition, 2 = subtraction, 3 = multiplication, 4 = division, 5 = all of the above):");
            Scanner scnr = new Scanner(System.in);
            int arithmeticType = scnr.nextInt();

            System.out.println("Please select difficulty level 1, 2, 3 or 4 (with level 1 being the least difficult and level 4 being the most difficult):");
            int diffLevel = scnr.nextInt();

            int i;
            int numCorrect = 0;

            for (i = 0; i < 10; i++) {
                if (askMathQuestion(diffLevel, arithmeticType)) {
                    numCorrect++;
                }
            }
            double percentCorrect = (numCorrect / 10);
            if (percentCorrect < .75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    }

    public static String getCorrectResponse() {
        Random rand = new SecureRandom();
        int statementNumber = rand.ints(1,4).findFirst().getAsInt();

        switch(statementNumber){
            case 1:
                return "Very good!";
            case 2:
                return "Excellent!";
            case 3:
                return "Nice work!";
            case 4:
                return "Keep up the good work!";
        }
        return "";
    }
    public static String getIncorrectResponse() {
        Random rand = new SecureRandom();
        int statementNumber = rand.ints(1, 4).findFirst().getAsInt();

        switch (statementNumber) {
            case 1:
                return "No. Please try again.";
            case 2:
                return "Wrong. Try once more.";
            case 3:
                return "Don't give up!";
            case 4:
                return "No. Keep trying.";
        }
        return "";
    }

    public static boolean askMathQuestion(int difficulty, int arithmeticType) {
        Random rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int integerOne = 0;
        int integerTwo = 0;

        switch (difficulty) {
            case 1:
                integerOne = rand.ints(0, 9).findFirst().getAsInt();
                integerTwo = rand.ints(0, 9).findFirst().getAsInt();
                break;
            case 2:
                integerOne = rand.ints(0, 99).findFirst().getAsInt();
                integerTwo = rand.ints(0, 99).findFirst().getAsInt();
                break;
            case 3:
                integerOne = rand.ints(0, 999).findFirst().getAsInt();
                integerTwo = rand.ints(0, 999).findFirst().getAsInt();
                break;
            case 4:
                integerOne = rand.ints(0, 9999).findFirst().getAsInt();
                integerTwo = rand.ints(0, 9999).findFirst().getAsInt();
                break;
        }

        if(arithmeticType == 5){
            arithmeticType = rand.ints(1,4).findFirst().getAsInt();
        }

        String operand;

        int solution = 0;

        switch (arithmeticType) {
            case 1:
                operand = "plus";
                solution = (integerOne + integerTwo);
                break;
            case 2:
                operand = "minus";
                solution = (integerOne - integerTwo);
                break;
            case 3:
                operand = "times";
                solution = (integerOne * integerTwo);
                break;
            case 4:
                operand = "divided by";
                solution = (integerOne / integerTwo);
                break;
            default:
                operand = "";
                break;
        }
1
        boolean answerCorrect = false;

        System.out.println("How much is " + integerOne + " " + operand + " " + integerTwo + "?");
        int answer = scnr.nextInt();

        if(answer == solution){
            System.out.println(getCorrectResponse());
            answerCorrect = true;
        }

        else{
            System.out.println(getIncorrectResponse());
        }

        return answerCorrect;


    }

}
