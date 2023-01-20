package jogo;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Painel extends JFrame{
    JButton carta1 = new JButton();

    public Painel(){
        // obtem e coloca a imagem dentro de uma BufferedImage
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("cenário.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cria e configura o texto no JLabel
        JLabel label = new JLabel();
        label.setText("");
        label.setFont(new Font("Calibri", Font.BOLD, 120));
        label.setForeground(Color.white);
        label.setHorizontalTextPosition(JLabel.CENTER);

        // Cria e configura a janela
        JFrame painel = new JFrame();
        painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setSize(300, 720);

        // Força a imagem a ficar do tamanho da janela
        Image dimg = img.getScaledInstance(painel.getWidth(), painel.getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon imageIcon = new ImageIcon(dimg);
        label.setIcon(imageIcon);

        // mostra a janela e adiciona o label a ela
        painel.setVisible(true);
        painel.add(label);


    }
}
