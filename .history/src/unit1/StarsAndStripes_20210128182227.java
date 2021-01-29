package unit1;

public class StarsAndStripes {
    public StarsAndStripes() {
        System.out.println("StarsAndStripes");
        printTwoBlankLines();
    }

    public void printTwentyStars() {
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
    }

    public void printTwentyDashes() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
    }

    public void printTwoBlankLines() {
        System.out.println();
        System.out.println();
    }

    public void printASmallBox() {
        for (int i = 0; i < 3; i++) {
            printTwentyDashes();
            printTwentyStars();
        }
        
        printTwentyDashes();
    }

    public void printABigBox() {

        for (int i = 0; i < 3; i++) {
            printTwentyDashes();
            printTwentyStars();
        }
        
        printTwentyDashes();

        for (int i = 0; i < 3; i++) {
            printTwentyDashes();
            printTwentyStars();
        }
        
        printTwentyDashes();

    }
}
