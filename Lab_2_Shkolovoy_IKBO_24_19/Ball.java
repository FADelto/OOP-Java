public class Ball
{
    private double x;
    private double y ;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move( double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
