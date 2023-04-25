package Lab_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabletka extends JFrame {


   JButton redButton = new JButton("Червоний");
    JButton blackButton = new JButton("Синій");
    JButton cancelButton = new JButton("Cancel");
    JPanel panel = new JPanel();

    Color currentColor = Color.WHITE;
    private JMenuBar menuBar = new JMenuBar();


    public Tabletka() {
        setTitle("Triangle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       redButton.addActionListener(new Lab_8.Tabletka.ButtonKlick2());


        blackButton.addActionListener(new Lab_8.Tabletka.ButtonKlick2());


        cancelButton.addActionListener(new Lab_8.Tabletka.ButtonKlick2());


        panel.add(redButton);
        panel.add(blackButton);
        panel.add(cancelButton);

        getContentPane().add(BorderLayout.SOUTH, panel);
        getContentPane().add(BorderLayout.CENTER, new Lab_8.Tabletka.DrawTriangle());
        setVisible(true);
    }
    class ButtonKlick2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == redButton) {
                currentColor = Color.RED;
            } else if (event.getSource() == blackButton) {
                currentColor = Color.BLUE;
            } else if (event.getSource() == cancelButton) {
                currentColor = Color.WHITE;
            }
            repaint();
        }
    }

    class DrawTriangle extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int xPoints[] = {100, 200, 300};
            int yPoints[] = {200, 100, 200};
            int nPoints = 3;
            g2d.setColor(currentColor);
            g2d.fillPolygon(xPoints, yPoints, nPoints);
        }


    }

}