package Main;

//Load Story.java and Scanner
import Story.Story;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Story.Story00();  //Call the Story00() in Story.java to output the plot to the console

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  //Let player press ENTER to continue

        Story.Story01();
    }
}