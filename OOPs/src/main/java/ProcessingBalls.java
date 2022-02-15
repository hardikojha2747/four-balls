import processing.core.PApplet;

public class ProcessingBalls
{

    private static final int DIAMETER = 20;
    public static final int NoOfBalls = 5;
    private final PApplet p;

        public ProcessingBalls(PApplet p)
        {
            this.p = p;
        }


    public void drawEllipse(int x)
        {
            for (int i = 1; i < NoOfBalls; i++)
            {
                int speed = i * x;
                int HeightFromTop = i * p.height / 5;
                p.ellipse(speed, HeightFromTop, DIAMETER,DIAMETER );
            }
        }
}