package other;

import java.util.Scanner;

public class Skills {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];

        int intOne = s.nextInt();
        int intTwo = s.nextInt();
        int intThree = s.nextInt();

        arr[0] = intOne;
        arr[1] = intTwo;
        arr[2] = intThree;

        for (int i = 0; i < arr.length; i++) {

            int max = arr[0];

            if(arr[i] > max) {
                max = arr[i];
            }
            
        }



    }

}
