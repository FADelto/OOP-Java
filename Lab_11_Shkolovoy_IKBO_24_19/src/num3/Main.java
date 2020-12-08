package num3;

import java.util.Scanner;
public class Main
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();
        System.out.print("Введите b: ");
        double b = input.nextDouble();
        System.out.print("Введите c: ");
        double c = input.nextDouble();

        double root1, root2;

        double determinant = b * b - 4 * a * c;


        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("корень1 = %.2f и корень2 = %.2f", root1 , root2);
        }

        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("корень1 = корень2 = %.2f;", root1);
        }

        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("корень1 = %.2f+%.2fi and корень2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
