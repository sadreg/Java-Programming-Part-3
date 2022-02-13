
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int min = 9999;
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
            i++;
        }
        System.out.println("Smallest number: "+min);
        int j = 0;
        while (j <= size) {
            if (min == list.get(j)) {
                System.out.println(min + " is at index " + j);
            }
            j++;
        }

    }
}
