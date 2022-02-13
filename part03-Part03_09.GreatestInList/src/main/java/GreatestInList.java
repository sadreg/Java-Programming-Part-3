
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int max = 0;
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
            i++;
        }
        System.out.println("The greatest number: " + max);
        // implement finding the greatest number in the list here
    }
}
