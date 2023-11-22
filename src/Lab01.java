import java.util.Scanner;
import java.util.Arrays;

public class Lab01 {

    public static void sortedandprint(int input) {
        try {
            Scanner scanner = new Scanner(System.in);

            int[] integer = new int[input];

            for(int i = 0; i < input; i++){
                integer[i] = scanner.nextInt();
            }
            Arrays.sort(integer);

            for (int i = 0; i < input; i++){
                System.out.println(integer[i]);
            }

            scanner.close();


        }catch (NumberFormatException e) {
            System.out.println("Bad input!!");
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your num : ");
        sortedandprint(s.nextInt());


    }
}
