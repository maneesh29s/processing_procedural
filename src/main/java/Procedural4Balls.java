import processing.core.PApplet;

public class Procedural4Balls extends PApplet{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    private float diameter=50;
    private int x=0;
    private int x1=0;
    private int x2=0;
    private int x3=0;
    private int x4=0;

    public static void main(String[] args) {
        PApplet.main("Procedural4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        setBackground();
    }

    @Override
    public void draw() {
//        setBackground();
        ellipse(x1,HEIGHT/5, diameter, diameter);
        x1++;
        ellipse(x2,2*HEIGHT/5, diameter, diameter);
        x2=x2+2;
        ellipse(x3,3*HEIGHT/5, diameter, diameter);
        x3=x3+3;
        ellipse(x4,4*HEIGHT/5, diameter, diameter);
        x4=x4+4;
    }

    private void setBackground() {
        int whiteBack = 255;
        background(whiteBack);
    }
}
