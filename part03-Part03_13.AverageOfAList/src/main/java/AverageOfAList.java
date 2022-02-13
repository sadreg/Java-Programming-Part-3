
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);

        numbers.remove(Integer.valueOf(2));
        int i=0;
        int size=numbers.size()-1;
        while(i<=size){
            System.out.println(numbers.get(i));
            i++;
        }
        
    }
        
    }