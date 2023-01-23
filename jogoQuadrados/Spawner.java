package jogoQuadrados;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spawner {

    public int timer = 0;

    public List<RecObj> rectangles = new ArrayList<RecObj>();

    public List<Particula> particulas = new ArrayList<Particula>();

    public void update(){

        timer++; //A cada 1s, eu quero um retangulo;
        if(timer % 60 == 0){
            rectangles.add(new RecObj(0, new Random().nextInt(480-40), 40, 40));
        }

        for(int i = 0; i < rectangles.size(); i++){
            RecObj current = rectangles.get(i);

            rectangles.get(i).update();

            //Quando o objeto sair da tela será distruido;
            if(current.x > Game.WIDTH){
                rectangles.remove(current);
                Game.contador--;
            }
//            Verificando se o quadrado foi clicado;
            if(Game.clicado){
                if(Game.mx >= current.x && Game.mx < current.x + current.width){
                    if(Game.my >= current.x && Game.my < current.y + current.height){
                        rectangles.remove(current);
                        Game.pontuação++;
                        Game.clicado = false;

                        for(int n = 0; n < 50; n++){
                            particulas.add(new Particula(current.x, current.y, 8, 8, current.color));
                        }
                    }
                }
            }
        }

        for(int i = 0; i < particulas.size(); i++){
            particulas.get(i).update();

            Particula part = particulas.get(i);
            if(part.timer >= 60){
                particulas.remove(part);
            }
        }
    }

    public void render(Graphics g){
        for(int i = 0; i < rectangles.size(); i++){
            RecObj current = rectangles.get(i);
            Graphics2D g2 = (Graphics2D) g;
            g2.rotate(Math.toRadians(current.rotation), current.x + current.width/2, current.y + current.height/2);
            g2.setColor(current.color);
            g2.fillRect(current.x, current.y, current.width, current.height);
            g2.rotate(Math.toRadians(-current.rotation), current.x + current.width/2, current.y + current.height/2);
        }
        for(int i = 0; i < particulas.size(); i++){
            particulas.get(i).render(g);
        }
    }
}
