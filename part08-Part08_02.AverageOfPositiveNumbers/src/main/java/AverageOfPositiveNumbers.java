
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer>list = new ArrayList<>();


        
        System.out.println("Type a number: ");
        
        while (true) {
            int input = scanner.nextInt();
            
            if (input > 0) {
                list.add(input);
            }

            else if (input < 0) {
                continue;
            }

            else {
                break;
            } 
            
        }
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        double average = (double)sum / list.size();
        
        
        if (list.size()<1) {
            System.out.println("Cannot calculate the average");
        }
        else {
            System.out.println(average);
        }
    }
}
