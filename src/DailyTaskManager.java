import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DailyTaskManager {

    public static void main(String[] args) throws Exception {
        //Declare Variable
        int optionChoice;

        Scanner scanner = new Scanner(System.in);

        //WelcomeText.show();
        MainWindow.mainWindow();
        while (true) {
            try {    
            System.out.print("Choose an option: ");
            optionChoice = scanner.nextInt();
            InputValidation.optionValid(optionChoice);
            break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.nextLine();
            }
        }
        switch (optionChoice) {
            case 1 -> 
                
                break;
        
            default:
                break;
        }
    }
}