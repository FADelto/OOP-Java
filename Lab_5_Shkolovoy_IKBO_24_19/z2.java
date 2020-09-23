import java.util.Scanner;
public class z2 {
    public static void recursion(int n, int i) {
        if (i == n) {
            System.out.print(i);
        }
        else{
            System.out.print(i);
            recursion(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        int i = 1;
        recursion(z, i); // вызов рекурсивной функции
    }
}