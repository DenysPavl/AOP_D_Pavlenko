package Lab_5;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.QuadCurve2D;
import javax.swing.*;

public class Tablet extends JFrame {
    JLabel label =new JLabel("Реєстрація\n");
    Font font = new Font("The new Roman",Font.BOLD,15);
    // Font font3 = new Font("The new Roman",Font.BOLD,15);
    Font font2=new Font("Calibri",Font.ITALIC,25);
    JButton button=new JButton("Зареєструватися\n");
    JTextField input1 = new JTextField("",15);
    JLabel label1 =new JLabel("Прізвище Ім'я\n");
    JTextField input2 = new JTextField("",15);
    JLabel label2 =new JLabel("Логін\n");
    JPasswordField input3 = new JPasswordField("",15);
    JLabel label3 =new JLabel("Пароль\n");
    JPasswordField input4 = new JPasswordField("",15);
    JLabel label4 =new JLabel("Повторіть пароль\n");
    JLabel label5 =new JLabel("Умовами\n");
    JCheckBox chek = new JCheckBox("Згоден з",false);

    public Tablet(){
        super("Реєстрація");
        this.setSize(600,600);
        this.setLocation(100,100);
        this.getContentPane().setBackground(Color.PINK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        input3.setEchoChar('$');
        input4.setEchoChar('$');
        label.setForeground(Color.RED);
        label.setFont(font2);
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        chek.setFont(font);
        label5.setFont(font);
        label.setBounds(250,20,200,40);
        label1.setBounds(10,60,200,40);
        input1.setBounds(10,95,500,40);
        label2.setBounds(10,130,200,40);
        input2.setBounds(10,165,500,40);
        label3.setBounds(10,200,200,40);
        input3.setBounds(10,235,300,40);
        label4.setBounds(10,270,200,40);
        input4.setBounds(10,305,300,40);
        label5.setForeground(Color.BLUE);
        chek.setBackground(Color.pink);
        chek.setBounds(50,400,90,20);
        label5.setBounds(140,400,200,20);
        button.addActionListener(new ButtonKlick());
        button.setForeground( Color.green);
        button.setBackground(Color.gray);
        button.setBounds(200,500,200,40);
        this.add(button);
        this.add(label);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(input1);
        this.add(input2);
        this.add(input3);
        this.add(input4);
        this.add(label5);
        this.add(chek);
        this.setVisible(true);
    }

    class ButtonKlick implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += "Result\n";
            message +="Згода "+((chek.isSelected())? "yes\n":"no, try again\n");
            JOptionPane.showMessageDialog(null,message,"output",JOptionPane.PLAIN_MESSAGE);
        }
    }


}

