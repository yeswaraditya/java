import java.util.Scanner;

class Factorial {
    int fact = 1;

    void findfactorial(int n) {

        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i=1;i<=n; i++) {
                fact =fact * i;
            }
            System.out.println(fact);
        }

        for (int i = n; i > 0; i--) {
            fact = fact + fact * i;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number to find factoril");
        int n = in.nextInt();
        Factorial f = new Factorial();
        f.findfactorial(n);
        in.close();

    }
}