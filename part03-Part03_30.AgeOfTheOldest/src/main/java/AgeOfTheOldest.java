
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            if(oldest<Integer.valueOf(parts[1])){
                oldest=Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
