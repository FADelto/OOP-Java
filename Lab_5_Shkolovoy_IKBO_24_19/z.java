import java.util.Scanner;
public class z {
    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай 
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += 1;
                j = i;
                System.out.print(n+",");
            }
            recursion(--n);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        recursion(z);
    }
}