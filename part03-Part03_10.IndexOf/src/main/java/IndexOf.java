
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int number = list.size();
        while (i < number) {
            if (search == list.get(i)) {
                System.out.println(search + " is at index " + i);
            }

            i++;
        }
    }
}
