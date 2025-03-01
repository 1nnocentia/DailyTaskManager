import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//coba bikin di list berdasarkan tanggal deadline, jadi nanti minta tanggalnya

public class DailyTaskManager {
    public static void linkedList(){
        Map<String, List<String>> taskManager = new HashMap<>();

        taskManager.put("Check Email", new LinkedList<>());
        taskManager.put("Attend Lecture", new LinkedList<>());
        taskManager.put("Exercise", new LinkedList<>());
        taskManager.put(" ", new LinkedList<>());
        taskManager.put(" ", new LinkedList<>());
    }
    public static void main(String[] args) throws Exception {
        //Declare Variable
        int taskChoose;
        List<Integer> taskChooseValid = Arrays.asList(1,2,3,4,5);

        Scanner scanner = new Scanner(System.in);       

        WelcomeText.welcome();
        WelcomeText.listTask();
        while (true){
        System.out.print("Which task you want to input? : ");
        taskChoose = scanner.nextInt(); //coba buat dia hanya terima jumlah input tertentu dan kasih keluar error kalau inputnya tidak sesuai (string padahal harus int)
        
        if (taskChooseValid.contains(taskChoose)){
            break;
        } System.out.println("Your input is not valid");
    }
}
}