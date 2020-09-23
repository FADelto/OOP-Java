public class main
{
    public static void main(String[] args)
    {
        Author d1 = new Author("Alex", "delto@gmail.com", 'M');
        Author d2 = new Author("Olga", "sdsf@gmail.com", 'F');

        d1.Info();
        d2.Info();

        Ball b1 = new Ball(45, 35);
        println(b1);
        b1.move(30, 70);
        println(b1);
    }
}
