public class Question4 {
    public static void main(String[] args) {
        printPattern();
        return;
    }

    public static void printPattern() {
        for(int i = 1 ; i <= 8 ; i++) {
            for(int j = 1 ; j <= 14 ; j++) {
                if(i == 8 || i == 7 ||
                  (i > 0 && j - i <= 0) || 
                  (j > 8 && j + i >= 15)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
