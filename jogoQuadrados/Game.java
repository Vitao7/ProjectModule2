package jogoQuadrados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable, MouseListener {

    public static final int WIDTH = 640, HEIGHT = 400;

    public static int contador = 100;

    public static int pontuação = 0;

    public static int mx, my;

    public static boolean clicado = false;

    public Spawner spawner;

    public Game(){
        Dimension dimension = new Dimension(WIDTH, HEIGHT);
        this.setPreferredSize(dimension);  //Evita conflitos de dimensões em tamanhos de telas diferentes;
        this.addMouseListener(this);

        spawner  = new Spawner();
    }

    public void update(){
        //Atualiza tudo que acontece no jogo;
            spawner.update();
            if(contador <= 0){
            contador = 100;
        }
    }

    public void render(){
        //Renderiza o jogo

        BufferStrategy bs = this.getBufferStrategy(); //Otimização dos graficos

        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH, HEIGHT);

        //Pontuação


/*
        g.setColor(Color.white);

        g.setFont(new Font("Arial", Font.BOLD, 23));

        g.drawString("Pontos: " + contador, WIDTH/2 -60, 30);
*/
        g.setColor(Color.green);
        g.fillRect(Game.WIDTH/2 - 100 -70, 20, contador*3, 20);
        g.setColor(Color.white);
        g.drawRect(Game.WIDTH/2 - 100 -70, 20, 300, 20);


        spawner.render(g);

        bs.show();
    }



    public static void main(String[] args) {
    Game game = new Game();

        JFrame jFrame = new JFrame("Meu jogo");
        jFrame.add(game);
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();  //Evita bordas desnecessaria
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        new Thread(game).start();


    }





    @Override
    public void run() {

        while(true){
            update();
            render();
            try {
                Thread.sleep(100/60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clicado = true;
        mx = e.getX();
        my = e.getY();


    }

    @Override
    public void mousePressed(MouseEvent e) {
        clicado = true;
        mx = e.getX();
        my = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
