package Lab_7;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proga extends JFrame {
    JLabel label1=new JLabel("Country_1");
    JTextField textField1=new JTextField("");
    JLabel label2=new JLabel("Country_2");
    JTextField textField2=new JTextField("");
    JLabel label3=new JLabel("Country_3");
    JTextField textField3=new JTextField("");
    JTextField kilk1=new JTextField("");
    JTextField kilk2=new JTextField("");
    JTextField kilk3=new JTextField("");
    JLabel label4=new JLabel("Num of people :");
    JButton button=new JButton("Next");
   public Proga(){
        super("Реєстрація");
        this.setSize(600,600);
        this.setLocation(100,100);
        this.getContentPane().setBackground(Color.orange);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
label1.setBounds(20,20,100,80);
textField1.setBounds(20,80,200,40);
label2.setBounds(20,110,100,80);
textField2.setBounds(20,170,200,40);
label3.setBounds(20,200,100,80);
textField3.setBounds(20,260,200,40);
kilk1.setBounds(300,80,100,40);
kilk2.setBounds(300,170,100,40);
       kilk3.setBounds(300,260,100,40);
       label4.setBounds(300,20,100,80);
       button.setBounds(220,400,100,30);
       button.addActionListener(new ButtonKlick());
        this.add(label1);
        this.add(textField1);
        this.add(label2);
       this.add(label3);
       this.add(textField2);
       this.add(textField3);
       this.add(kilk1);
       this.add(kilk2);
       this.add(kilk3);
       this.add(label4);
       this.add(button);
       this.setVisible(true);
    }
    class ButtonKlick implements ActionListener {
        public void actionPerformed(ActionEvent event) {
int num1,num2,num3;
            num1= Integer.parseInt(kilk1.getText());
            num2= Integer.parseInt(kilk2.getText());
            num3= Integer.parseInt(kilk3.getText());
            if (num1>num2 && num1>num3){
                JOptionPane.showMessageDialog(null,textField1.getText(),"Країна з найбільшою чиселністю населення",JOptionPane.PLAIN_MESSAGE);
            }
            if (num2>num1 && num2>num3){
                JOptionPane.showMessageDialog(null,textField2.getText(),"Країна з найбільшою чиселністю населення",JOptionPane.PLAIN_MESSAGE);
            }
            if (num3>num2 && num3>num1){
                JOptionPane.showMessageDialog(null,textField3.getText(),"Країна з найбільшою чиселністю населення",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
