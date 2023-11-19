import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lab01 {

    public static void sortedandprint(String input) {
        try {
            String[] splited_input = input.split(" ");
            int[] arr = Stream.of(splited_input).mapToInt(Integer::parseInt).toArray();
            int temp = arr[0];
            if(arr[0] >= arr.length) {
                temp = arr.length - 1;
            }
            Arrays.sort(arr,1, arr.length);
//            System.out.println(Arrays.toString(arr));
            for (int i = 1; i <= temp; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (NumberFormatException e) {
            System.out.println("Bad input!!");
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your num : ");
        sortedandprint(s.nextLine());


    }
}
