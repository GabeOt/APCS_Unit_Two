import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first name?");
        String first = scan.nextLine();
        System.out.println("What is the last name?");
        String last = scan.nextLine();
        System.out.println(first + " " + last);
        int length1 = first.length();
        int length2 = last.length();
        int lengthTotal = length1+length2;
        System.out.println(lengthTotal);
        String firstInitial = first.substring(0,1);
        String lastInitial = last.substring(0,1);
        System.out.println(firstInitial + lastInitial);
        int comparison = first.compareTo(last);
        System.out.println(comparison);
        int lastNum = length1-1;
        char lastLetter = first.charAt(lastNum);
        int firstLast = last.indexOf(lastLetter);
        System.out.println(firstLast);
        int lastNum2 = length2-1;
        char lastLetter2 = last.charAt(lastNum2);
        int lastFirst = first.indexOf(lastLetter2);
        System.out.println(lastFirst);
        int mid1 = length1/2;
        int mid2 = length2/2;
        String firstHalf1 = first.substring(0, mid1);
        String secondHalf1 = first.substring(mid1, length1);
        String firstHalf2 = last.substring(0, mid2);
        String secondHalf2 = last.substring(mid2, length2);
        System.out.println(firstHalf1 + secondHalf2);
        System.out.println(firstHalf2 + secondHalf1);





        




        // Get the first and last names as separate variables (use the Scanner object to get the input)


        // Use the required string methods to print out the information


    }
}
