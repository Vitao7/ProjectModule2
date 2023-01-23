package jogoQuadrados;

import java.awt.*;
import java.util.Random;

public class RecObj extends Rectangle {

    public Color color;

    public int speed = 0;

    public int rotation = 0;

    public RecObj(int x, int y, int width, int heigh){
        super(x, y, width, heigh);

        color = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)); //Criando uma cor sorteada;

       // speed = new Random().nextInt(6-4)+4; //Sempre gerando uma nova velocidade;
    }

    public void update(){

        x+=1; //velocidade
        rotation++;
        if(rotation >= 360){
            rotation =0;
        }
    }

}
