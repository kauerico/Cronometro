import java.awt.*;
import javax.swing.*;

public class Janela{
    ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("Imagem/icon.png"));
    JFrame janelaCronometro = new JFrame();
    JLabel contador = new JLabel();
    Cronometro cronometro = new Cronometro();
    JButton StartButton = new JButton("Start");
    JButton StopButton = new JButton("Stop");
    JButton ResetButton = new JButton("Reset");

    String segundosTexto = String.format("%02d", cronometro.segundos);
    String minutosTexto = String.format("%02d", cronometro.minutos);
    String horasTexto = String.format("%02d", cronometro.horas);
    
    void janelaCronometro(){

        contador.setText(horasTexto+ ":"+ minutosTexto + ":" + segundosTexto);
        contador.setBounds(100,100,200,100);
        contador.setFont(new Font("Verdana", Font.TYPE1_FONT, 35));
        contador.setBorder(BorderFactory.createBevelBorder(1));
        contador.setOpaque(true);
        contador.setHorizontalAlignment(JTextField.HORIZONTAL);

        StartButton.setBounds(100,230 ,100, 50);
        StartButton.setFont(new Font("Ink free",Font.PLAIN, 20));
        StartButton.setFocusable(false);



        janelaCronometro.add(StartButton);
        janelaCronometro.add(contador);
        janelaCronometro.setVisible(true);
        janelaCronometro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaCronometro.setSize(420, 420);
        janelaCronometro.setResizable(false);
        janelaCronometro.setLocationRelativeTo(null);  
        janelaCronometro.getContentPane().setBackground(new Color(0,0,0) );
        janelaCronometro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaCronometro.setTitle("Cronômetro");
        janelaCronometro.setIconImage(logo.getImage());

    

    }

}
