class Question5 {
    public static void main(String[] args) {
        int n = 14;
        printPattern(n);
        return;
    }

    public static void printPattern(int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(i == 0 || i == n-1 || j == 0 ||
                    (i > 0 && i + j <= 6) || 
                    (i > 6 && i - j >= 6)) {
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