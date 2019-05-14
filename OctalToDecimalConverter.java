import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[] args) {
        String octal = args[0];
        int numberOfTerms = octal.length();
        if (isNotOctal(octal)) {
            System.out.println("your input is not an octal number");
            return;
        }
        int decimal= getDotProducts(getDigits(args[0]),getPowerSereis(numberOfTerms));
        System.out.println("The decimal number of the number you have given is " + decimal);
        }

    private static boolean isNotOctal(String octal) {
        return octal.contains("8") || octal.contains("9");
    }

    private static int getOctalNumber(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }

    private static List<Integer> getDigits(String number) {
        String[] userInput = number.split("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=userInput.length;
        while(i>0){
            list.add(Integer.valueOf(userInput[i-1]));
            i--;
        }
        return digits;
    }

    private static List<Integer> getPowerSereis(int numberOfTerms) {
        List<Integer> powerSeries = new ArrayList<Integer>();
        int exponent = 8;
        for (int i = 0; i < numberOfTerms; i++) {
            int power = (int) (Math.pow(exponent, i));
            powerSeries.add(power);
        }
        return powerSeries;
    }
    private static int getDotProducts(List<Integer> numbers1, List<Integer> numbers2) {
        int dotProduct=0,i=0;
        while(i<numbers1.size()){
            dotProduct+=numbers1.get(i)*numbers2.get(i);
            i++;
        }
        return dotProduct;
    }
}