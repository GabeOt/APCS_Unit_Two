import java.util.Scanner;

public class Courses {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the description of the course?");
        String description = scan.nextLine();
        int length = description.length();
        int courseNameNum = description.indexOf(" ");
        String courseName = description.substring(0, courseNameNum);
        System.out.println("Department: " + courseName);
        int courseNumNum = description.indexOf(" " , courseNameNum+1);
        String courseNum = description.substring(courseNameNum, courseNumNum);
        System.out.println("Course Number:" + courseNum);
        String courseTitle = description.substring(courseNumNum, length);
        System.out.println("Title:" + courseTitle);








    }
}
