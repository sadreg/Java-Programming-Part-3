
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name="";
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            if (oldest < Integer.valueOf(parts[1])) {
                oldest = Integer.valueOf(parts[1]);
                name=parts[0];
            }
            
        }
        
        System.out.println("Name of the oldest " + name);
    }
}
