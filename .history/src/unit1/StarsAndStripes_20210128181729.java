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
        System.out.println("---");
        System.out.println("[ ]");
        System.out.println("---");
    }

    public void printABigBox() {
        System.out.println("---------------------------");
        System.out.println("[                         ]");
        System.out.println("[                         ]");
        System.out.println("[                         ]");
        System.out.println("[                         ]");
        System.out.println("---------------------------");

    }
}
