package Classwork15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UI extends JFrame implements ActionListener {
   JLabel text= new JLabel();
   String num;
   String sign;

    UI(){
       setSize(700,700);
       setLayout(null);
       text.setBounds(100 ,50 , 300 ,50);
       add(text);
       JButton b1= new JButton();
       b1.setBounds(100,100 ,75 ,75);
       JButton b2= new JButton();
       b2.setBounds(175,100 ,75 ,75);
       JButton b3= new JButton();
       b3.setBounds(250,100 ,75 ,75);
       JButton b4= new JButton();
       b4.setBounds(100,175 ,75 ,75);
       JButton b5= new JButton();
       b5.setBounds(175,175 ,75 ,75);
       JButton b6= new JButton();
       b6.setBounds(250,175 ,75 ,75);
       JButton b7= new JButton();
       b7.setBounds(100,250 ,75 ,75);
       JButton b8= new JButton();
       b8.setBounds(175,250 ,75 ,75);
       JButton b9= new JButton();
       b9.setBounds(250,250 ,75 ,75);
       JButton b0= new JButton();
       b0.setBounds(175,325 ,75 ,75);
       b0.setText("0");

       add(b0);
       JButton bPlus= new JButton();
       bPlus.setBounds(325,100 ,75 ,75);
       bPlus.setText("+");
       add(bPlus);

       JButton bMinus= new JButton();
       bMinus.setBounds(325,175 ,75 ,75);
       bMinus.setText("-");
       add(bMinus);
       JButton bMult= new JButton();
       bMult.setText("*");
       bMult.setBounds(325,250 ,75 ,75);
       add(bMult);

       JButton bDevide= new JButton();
       bDevide.setText("/");
       bDevide.setBounds(325,325 ,75 ,75);
       add(bDevide);

       JButton bEaqual = new JButton();
       bEaqual.setText("=");
       bEaqual.setBounds(250,325 ,75 ,75);
       add(bEaqual);
       setVisible(true);
       List<JButton> buttons = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9));
       List<JButton> buttons1 = new ArrayList<>(Arrays.asList(b0,bPlus, bMinus, bMult,  bDevide ,bEaqual));
       int i=-1;
       for (JButton btn:buttons) {
            i++;
            btn.addActionListener(this);
            btn.setText(""+(i+1));
            add(btn);
        }
       for (JButton btn:buttons1) {
            btn.addActionListener(this);
        }

       JButton bClear = new JButton();
       bClear.setText("C");
       bClear.setBounds(100, 325, 75, 75);
       bClear.addActionListener(this);
       add(bClear);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JButton bDot = new JButton(".");
       bDot.setBounds(400, 325, 75, 75);
       bDot.addActionListener(this);
       add(bDot);

    }

   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      String currentText = text.getText();
      String buttonText = b.getText();

      switch (buttonText) {
         case "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "." -> text.setText(currentText + buttonText);
         case "+", "-", "*", "/" -> {
            num = currentText;
            sign = buttonText;
            text.setText(num + sign);
         }
         case "=" -> {
            String num2 = currentText.substring(num.length() + 1);
            double result = switch (sign) {
               case "+" -> Double.parseDouble(num) + Double.parseDouble(num2);
               case "-" -> Double.parseDouble(num) - Double.parseDouble(num2);
               case "*" -> Double.parseDouble(num) * Double.parseDouble(num2);
               case "/" -> Double.parseDouble(num) / Double.parseDouble(num2);
               default -> 0;
            };
            if ((int) result== result){
               text.setText(String.valueOf((int)result));

            }else  text.setText(String.valueOf(result));
         }
         case "C" -> text.setText("");
      }
   }
}
