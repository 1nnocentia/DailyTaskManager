import java.util.Arrays;
import java.util.List;

public class InputValidation {
    public static void optionValid(int optionChoice){
        List<Integer> validChoices = Arrays.asList(1,2,3,4);

        //Kayaknya bisa ditambah ini, kalau misal dia input 4 tapi belum selesai tasknya, ksh peringatan kalau blm selesai tugasnya baru tanya ulang lagi mau keluar atau tidak
        if (optionChoice == 4) {
            //System.out.println("You're Completed Today Task!!! You're AMAZING!!!");
            System.out.println("Thank you for using Daily Task Manager! See u!");
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                System.out.println("Error during sleep: " + e.getMessage());
            }
            MaybeWeNeedThis.clearScreen();
            System.exit(0);
        }

        if(!validChoices.contains(optionChoice)){
            throw new IllegalArgumentException("Invalid choice. Please enter 1, 2, 3 or 4");

    }
}
}