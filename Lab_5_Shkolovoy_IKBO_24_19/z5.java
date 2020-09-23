import java.util.Scanner;
public class z5{
    public static int recursion(int z) {
        if(z<10){
            return z;
        }
        else{
            return z%10 + recursion(z/10);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        System.out.println(recursion(z));
    }
}