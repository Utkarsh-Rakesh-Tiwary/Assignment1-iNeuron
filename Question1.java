class Question1 {
    public static void main(String[] args) {
        int n = 5;
        char[] ch = {'I' , 'N' , 'E' , 'U' , 'R' , 'O' , 'N'};
        for(int i = 0 ; i < ch.length ; i++){
            print(ch[i] , n);
        }
        return;
    }

    public static void print(char ch , int n) {
        switch(ch) {
            case 'I' : 
                printI(n);
                break;
            case 'N' :
                printN(n);
                break;
            case 'E' :
                printE(n);
                break;
            case 'U' :
                printU(n);
                break;
            case 'R' :
                printR(n);
                break;
            case 'O' :
                printO(n);
                break;
        }
    }

    // method to print "I".
    public static void printI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)
                    System.out.printf("*");
                else if (j == n / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
        System.out.printf("\n");
        }
    }

// method to print "N".
    public static void printN(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= n; j++) {
                if (j == n)
                    System.out.printf("*");
                else if (j == count)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            count++;
            System.out.printf("\n");
        }
    }

// method to print "E"
    public static void printE(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1)
                    || (i == n / 2
                        && j <= n / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

// method to print "U"
    public static void printU(int n) {
        for (int i = 0; i < n; i++) {
            if (i != 0 && i != n - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
            for (int j = 0; j < n; j++) {
                if (((i == n - 1)
                    && j >= 0
                    && j < n - 1))
                    System.out.printf("*");
                else if (j == n - 1 && i != 0
                        && i != n - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

//metho to print "R"
    public static void printR(int n) {
        int w = (2 * n) - 1;
        int h = (n / 2);
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < w ; j++) {
                if ((i == 0 || i == h)
                    && j < (w - 2))
                    System.out.printf("*");
                else if (j == (w - 2)
                        && !(i == 0 || i == h))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

// method to print "O"
    public static void printO(int n) {
	    int sp = (n / 3);
	    int w = n / 2 + n / 5 + sp + sp;
	    for (int i = 0; i < n; i++) {
		    for (int j = 0; j <= w; j++) {
			    if (j == w - Math.abs(sp)
				    || j == Math.abs(sp))
				    System.out.printf("*");
			    else if ((i == 0
					    || i == n - 1)
					    && j > Math.abs(sp)
					    && j < w - Math.abs(sp))
				    System.out.printf("*");
			    else
				    System.out.printf(" ");
		    }
		    if (sp != 0
			    && i < n / 2) {
			    sp--;
		    }
		    else if (i >= (n / 2 + n / 5))
			    sp--;
		    System.out.printf("\n");
	    }
    }
}
