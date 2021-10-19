import java.util.Scanner;

public class EmailGenerator {

    public static String makeUserName(String fullName){
        String firstInitial = "" + fullName.charAt(0);
        firstInitial = firstInitial.toLowerCase();
        int length = fullName.length();
        int lastNameStart = fullName.indexOf(" ");
        String lastName = fullName.substring(lastNameStart+1, length);
        lastName = lastName.toLowerCase();
        int num = (int) (Math.random()*90+10);
        String userName = firstInitial + lastName + num;
        return userName;

    }

    public static String makeEmail(String provider, String userName){
        String start = userName;
        String middle = "@";
        String end = provider;
        String email = start + middle + end;
        return email;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the full name?");
        String fullName = scan.nextLine();
        String userName = makeUserName(fullName);
        System.out.println("What is the provider?");
        String provider = scan.nextLine();
        String end = makeEmail(provider, userName);
        System.out.println("The email address is: " + end);





    }
}