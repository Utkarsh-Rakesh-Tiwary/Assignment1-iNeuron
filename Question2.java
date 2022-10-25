public class Question2 {
    public static void main(String[] args) {
        int cnt = 1 , n = 4;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(cnt + " ");
            }
            System.out.println();
            cnt++;
        }
    }
}
