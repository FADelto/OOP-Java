import java.util.Scanner;
public class z12{
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        if (z > 0) {
            if (z % 2 == 1) {
                System.out.println(z);
                recursion();
            } else {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}