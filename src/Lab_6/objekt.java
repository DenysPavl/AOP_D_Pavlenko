package Lab_6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class objekt extends JFrame  {

    JButton redButton = new JButton("Червоний");
    JButton blackButton = new JButton("Синій");
    JButton cancelButton = new JButton("Cancel");
    JPanel panel = new JPanel();

    Color currentColor = Color.WHITE;


    public objekt() {
        setTitle("Triangle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        redButton.addActionListener(new ButtonKlick());


        blackButton.addActionListener(new ButtonKlick());


        cancelButton.addActionListener(new ButtonKlick());


        panel.add(redButton);
        panel.add(blackButton);
        panel.add(cancelButton);
       
        getContentPane().add(BorderLayout.SOUTH, panel);
        getContentPane().add(BorderLayout.CENTER, new DrawTriangle());
        setVisible(true);
    }
class ButtonKlick implements ActionListener {
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

