package jogoQuadrados;

import java.awt.*;
import java.util.Random;

public class Particula extends Rectangle{
    public Color color;

    public int speed = 0;

    public int rotation = 0;

    public double xa, ya;


    public double dx, dy;

    public int timer = 0;

    public Particula(int x, int y, int width, int heigh, Color color){
        super(x, y, width, heigh);

        xa = x;
        ya = y;

        this.color = color;

        dx = new Random().nextGaussian();
        dy = new Random().nextGaussian();

        speed = new Random().nextInt(6-4)+4; //Sempre gerando uma nova velocidade;
    }

    public void update(){

        xa += dx * speed;
        ya += dy * speed;
        timer++;
    }

    public void render(Graphics g){
        g.setColor(this.color);
        g.fillRect((int)xa, (int) ya, width, height);
    }
}
