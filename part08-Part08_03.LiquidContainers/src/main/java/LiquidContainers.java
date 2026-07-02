
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            
            }

            String[] parts = input.split(" ");

            String command = parts [0];
            int amount = Integer.valueOf(parts[1]);

            
         if (command.equals("add")) {
            
            if (amount < 0) {
                continue;
            } else if (amount + first > 100) {
                first = 100;
            } else{
                first = amount + first;
            }
        }   
        else if (command.equals("move")) {
            if (amount < 0) {
                continue;
            } else if (second + amount > 100) {
                int space = 100 - second ;
                second = 100;
                first = first - space;
            }else if (amount > first) {
                second = first + second;
            } 
            else  {
                first = first - amount;
                second = second + amount;
            }
        }

         else if (command.equals("remove")) {
            if (amount > second) {
                second = 0;
            } else if (second == 0) {
                continue;
            } else {
                second = second - amount;
            }


        }
    }
  }
}

