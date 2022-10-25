public class Question3 {
    public static void main(String[] args) {
        int n = 14;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n  ; j++) {
                if(i == 0 || i == n-1 ||
                    (j == 0 && i > 0 && i < n-1) ||
                    (j == n - 1 && i > 0 && i < n - 1) || 
                    (i > 0 && j < (n/2)-1 && i + j < 7) ||
                    (j >= n/2 && i > 0 && j < n-1 && j-i >= 6)) {
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
