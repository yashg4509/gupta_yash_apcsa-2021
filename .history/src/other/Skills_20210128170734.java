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

    public void questionTwo() {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();
        String output = "";

        if(input == 1) {
            output = "infant";
        } else if (input == 2 || input == 3) {
            output = "toddler";
        } else if (input == 4) {
            output = "preschooler";
        } else if (input == 5) {
            output = "kindergartner";
        } else if (input >= 6 && input <= 10) {
            output = "elementary age";
        } else if (input >= 11 && input <= 13) {
            output = "middle schooler";
        } else if (input >= 14 && input <= 17) {
            output = "high school";
        } else if (input == 18) {
            output = "too cool";
        } else if (input > 18) {
            output = "old";
        }

        System.out.println(output);

    }

}
