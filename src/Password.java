import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first name?");
        String first = scan.nextLine();
        System.out.println("What is the middle name?");
        String middle = scan.nextLine();
        System.out.println("What is the last name?");
        String last = scan.nextLine();
        System.out.println("What is the age?");
        int age = scan.nextInt();
        int length1 = first.length();
        int middleFirstNum = length1/2;
        String middleFirstLet = "" + first.charAt(middleFirstNum);
        middleFirstLet = middleFirstLet.toUpperCase();
        int length2 = middle.length();
        int middleMidNum = length2/2;
        String middleMidLet = "" + middle.charAt(middleMidNum);
        middleMidLet = middleMidLet.toUpperCase();
        int length3 = last.length();
        int middleLastNum = length3/2;
        String middleLastLet = "" + last.charAt(middleLastNum);
        middleLastLet = middleLastLet.toUpperCase();
        int lastFirstNum = length1-1;
        char lastFirstLet = first.charAt(lastFirstNum);
        int lastMidNum = length2-1;
        char lastMidLet = middle.charAt(lastMidNum);
        int lastLastNum = length3-1;
        char lastLastLet = last.charAt(lastLastNum);
        int ageFinal = age*75;
        System.out.println("Password: " + middleFirstLet + middleMidLet + middleLastLet + lastFirstLet + lastMidLet + lastLastLet + ageFinal);




    }


}
