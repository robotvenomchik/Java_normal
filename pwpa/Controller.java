package lll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Model m=new Model();
    UI ui;
    Controller(){
        ui=new UI(this);
    }
    public void click(){
        m.print();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        click();
    }
}
