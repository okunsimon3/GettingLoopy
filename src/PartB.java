public class PartB {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++)
                System.out.printf("%1s", "*");
            System.out.println();
        }
        System.out.println("\n");
        for(int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++)
                System.out.printf("%1s", "*");
            System.out.println();
        }
        System.out.println("\n");
        for(int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++)
                System.out.printf("%1s", "*");
            System.out.println();
        }
    }
}
