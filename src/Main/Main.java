package Main;

//Load Story.java and Scanner
import Story.Story;
import java.util.Scanner;
import java.util.Random;

public class Main{


    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();  //news some method (wtf is this)

        Story.Story00();  //Call the Story00() in Story.java to output the plot to the console

        scanner.nextLine();  //Let player press ENTER to continue

        Story.Story01();
        String name = scanner.nextLine();

        Story.Story02(name);  //input player name
        scanner.nextLine();

        Story.Story03();
        scanner.nextLine();

        Story.Story04(name);

        int num = Random.nextInt(0, 101);  //Random a fxxking number
        int Guess = scanner.nextInt();
        boolean IsThisTheFirstToGuess = false;
        if (Guess == 0) {
            IsThisTheFirstToGuess = true;
            Story.StoryEnd00Part1();
            scanner.nextLine();
            scanner.nextLine();  //Cause unknown reasons, nextLine() must be called twice to execute
            Story.StoryEnd00Part2();
        }
        int Time = 8;

        while (Time != 0 && !IsThisTheFirstToGuess) {
            if (Guess < num) {
                System.out.print("或许小了一点？");
            } else if (Guess > num) {
                System.out.print("或许大了一点？");
            } else if (Guess == num) {
                if (num <= 50) {
                    Story.StoryEnd01();
                    break;
                } else {
                    Story.StoryEnd02();
                    break;
                }
            } else {
                System.out.print("你输入了个什么东西？");
            }
            Time -= 1;
            Guess = scanner.nextInt();
        }

    }
}