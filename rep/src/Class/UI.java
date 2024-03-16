package Class;

import com.sun.source.util.TaskListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener  {

    JButton b = new JButton("ok");
    UI(){
        setLayout(null);
        setSize(500,500);
        b.addActionListener(this);
        add(b);
        b.setBounds(50,50,100,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        new Task().start();
    }
    class Task extends Thread{
        public void run(){
            for (int i = 0; i < 100; i++) {
                System.out.println("he");
            }
        }
    }
}
