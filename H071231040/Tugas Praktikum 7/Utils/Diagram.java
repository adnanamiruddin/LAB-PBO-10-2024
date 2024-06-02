package Tugas_LAB_PBO.TP_7.Utils;

import javax.swing.*;
import java.awt.*;

public class Diagram {
    public static void TampilkanMenu() {
        JFrame jf = new JFrame("Diagram");

        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel() {
            private Image backgroundImage;

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage == null) {
                    ImageIcon imageIcon = new ImageIcon("Tugas_LAB_PBO\\TP_7\\Diagram.png");
                    backgroundImage = imageIcon.getImage();
                }
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        jf.setContentPane(panel);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
