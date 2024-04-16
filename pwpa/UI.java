package lll;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    Controller c ;
    UI(Controller c){
        this.c=c;
        setTitle("new classwork.UI");
        setSize(500, 350);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Button b= new Button(
                "OK"
        );
        b.addActionListener(c);
        b.setBounds(10,10,10,10);
        add(b);
        setVisible(true);
    }
}
