import processing.core.PApplet;

public class OOPs4Balls extends PApplet
{
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    private int x;
    private ProcessingBalls obj;


        public static void main(String[] args)
        {
            PApplet.main("OOPs4Balls");
        }

        @Override
        public void settings()
        {
            size(WIDTH, HEIGHT);
        }

        @Override
        public void setup()
        {
           obj = new ProcessingBalls(this);
        }

        @Override
        public void draw()
        {
            obj.drawEllipse(x);
            x++;
        }
}