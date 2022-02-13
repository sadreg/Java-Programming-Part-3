
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        int sum = 0;
        int count = 0;
        double average = 0;
        String name = new String();
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            int length = parts[0].length();
            if (longest < length) {
                longest = length;
                name=parts[0];
            }
            count++;
            sum = sum + Integer.valueOf(parts[1]);
        }
        average = (double) sum / count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
