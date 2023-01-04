import java.util.Scanner;
public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if (number >= 1000 || number < 0)   System.out.println("Out of ability");
        else
            if(number == 0)     System.out.println("zero");
        else
            if(number > 0 & number < 10) System.out.println(numFrom0To9(number));
        else
            if(number >= 10 && number < 20) System.out.println(numFrom10To19(number));
        else
            if(number >= 20 && number < 100) System.out.println(from20To99(number));
        else {
            System.out.print(numFrom0To9(number/100));
            int num = number - (number/100) * 100;
            if(num == 0) System.out.print(" hundred");
            if(num > 0 && num < 10) System.out.print(" hundred and " + numFrom0To9(num));
            if(num >= 10 && num < 20) System.out.print(" hundred and " + numFrom10To19(num));
            if(num >= 20) System.out.print(" hundred and " + from20To99(num));
            }
    }

    public static String numFrom0To9(int x) {
        String result = "";
        switch (x) {
            case 0:
                result = "";
                break;
            case 1:
                result =  "one";
            break;
            case 2:
                result =  "two";
            break;
            case 3:
                result =  "three";
            break;
            case 4:
                result =  "four";
            break;
            case 5:
                result =  "five";
            break;
            case 6:
                result =  "six";
            break;
            case 7:
                result =  "seven";
            break;
            case 8:
                result =  "eight";
            break;
            case 9:
                result =  "nine";
            break;
        }
    return result;
    }

    public static String numFrom10To19(int x) {
        String result = "";
        switch (x) {
            case 10:
                result =  "ten";
                break;
            case 11:
                result =  "eleven";
                break;
            case 12:
                result =  "twelve";
                break;
            case 13:
                result =  "thirteen";
                break;
            case 14:
                result =  "fourteen";
                break;
            case 15:
                result =  "fifteen";
                break;
            case 16:
                result =  "sixteen";
                break;
            case 17:
                result =  "seventeen";
                break;
            case 18:
                result =  "eightteen";
                break;
            case 19:
                result =  "nineteen";
                break;
        }
        return result;
    }

    public static String unitsFrom2To9(int x) {
        String result = "";
        switch (x) {
            case 2:
                result =  "twen";
                break;
            case 3:
                result =  "thir";
                break;
            case 4:
                result =  "four";
                break;
            case 5:
                result =  "fif";
                break;
            case 6:
                result =  "six";
                break;
            case 7:
                result =  "seven";
                break;
            case 8:
                result =  "eigh";
                break;
            case 9:
                result =  "nine";
                break;
        }
        return result;
    }

    public static String from20To99(int x) {
        return unitsFrom2To9(x/10) + "ty " + numFrom0To9(x - (x/10)*10);
    }

}

