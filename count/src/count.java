import javax.swing.*;
import java.awt.*;
public class count extends JFrame{
    JTextField text;
    JButton button;
    JRadioButton radio1,radio2,radio3,radio4,radio5;
    ButtonGroup group;
    public count(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        add(new JLabel("第一个数："));
        text=new JTextField(10);
        add(text);
        group = new ButtonGroup();
        radio1 = new JRadioButton("+");
        radio2 = new JRadioButton("-");
        radio3 = new JRadioButton("*");
        radio4 = new JRadioButton("/");
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        add(radio1);
        add(radio2);
        add(radio3);
        add(radio4);

        add(new JLabel("\n第二个数："));
        text=new JTextField(10);
        add(text);

        button = new JButton("计算");
        add(button);

        add(new JLabel("\n  "));
        text=new JTextField(10);
        add(text);
    }
    public static void main (String args[]){
        count c=new count();
        c.setBounds(100,100,150,150);
        c.setTitle("计算器");
    }
}
