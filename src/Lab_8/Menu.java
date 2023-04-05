package Lab_8;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
class Menu extends JMenuBar {
    Color currentColor = Color.WHITE;
    JMenuItem openItem3 = new JMenuItem ("Відміна");
    JMenuItem openItem = new JMenuItem ("Синій колір");
    JMenuItem openItem2 = new JMenuItem ("Червоний колір");
    public Menu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);
        //додаємо пункти в меню файл


openItem.addActionListener(e -> {
    Graphics g = panel.getGraphics();
    g.setColor(Color.BLUE);
    int xPoints[] = {100, 200, 300};
    int yPoints[] = {200, 100, 200};
    g.fillPolygon(xPoints, yPoints, 3);
});
        openItem.setMnemonic(KeyEvent.VK_Z);
        openItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK));

openItem2.addActionListener(e -> {
    Graphics g = panel.getGraphics();
    g.setColor(Color.RED);
    int xPoints[] = {100, 200, 300};
    int yPoints[] = {200, 100, 200};
    g.fillPolygon(xPoints, yPoints, 3);
});
        openItem2.setMnemonic(KeyEvent.VK_X);
        openItem2.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));

openItem3.addActionListener(e -> {
    Graphics g = panel.getGraphics();
    g.setColor(Color.WHITE);
    int xPoints[] = {100, 200, 300};
    int yPoints[] = {200, 100, 200};
    g.fillPolygon(xPoints, yPoints, 3);
});
        openItem3.setMnemonic(KeyEvent.VK_C);
        openItem3.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));

        add(panel,BorderLayout.CENTER);

        fileMenu.add(openItem);

        fileMenu.add(openItem2);

        fileMenu.add(openItem3);
    }

}
