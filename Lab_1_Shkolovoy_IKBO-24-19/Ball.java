public class Ball {
    //Переменные
    public int RedBall;
    public int BlueBall;
    public int GreenBall;

    //Конструкторы
    public Ball(){
        RedBall = 10;
        BlueBall = 20;
        GreenBall = 30;
    }

    public Ball(int RedBallRadius, int BlueBallRadius, int GreenBallRadius) {
        RedBall = RedBallRadius;
        BlueBall = BlueBallRadius;
        GreenBall = GreenBallRadius;
    }
    //Методы
    public int getRedBall(){
        return RedBall;
    }

    public int getBlueBall(){
        return BlueBall;
    }

    public int getGreenBall(){
        return GreenBall;
    }
}