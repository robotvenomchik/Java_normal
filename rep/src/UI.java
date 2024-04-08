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
        b.setBounds(50,50,100,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        new Task().start();
    }
    class Task extends Thread{
        public void run(){

            for (int i = b.getX(); i < 400;) {
                int j=i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i+10<400){
                    i+=20;
                }
                else{
                    i+=400-i;
                }
                b.setBounds(i,j, b.getWidth(), b.getHeight());
            }
            for (int j= b.getX(); j>50;){
                int i=j;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(j-10<400){
                    j-=10;
                }
                else{
                    j-=400-j;
                }
                b.setBounds(j,i, b.getWidth(), b.getHeight());
            }


        }
    }

    public static void main(String[] args) {
        new UI();
    }
}
