package ru.mirea.pr3;

public class TestShape {
    public static void main(String[] args) {
        Shape p1 = new Circle(5.5, "Red", false);
        System.out.println(p1);
        System.out.println(p1.getArea());
        System.out.println(p1.getPerimeter());
        System.out.println(p1.getColor());
        System.out.println(p1.isFilled());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);


        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }

}