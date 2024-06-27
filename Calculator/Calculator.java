import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    double firstNumber;
    double secondNumber;
    String operator;
    JFrame f;
    JTextField tx;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;

    public void actionPerformed(ActionEvent A){
        if (A.getSource()==b1) {
            tx.setBackground(Color.green);
            tx.setText("CASIO");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b10.setEnabled(true);
            b11.setEnabled(true);
            b12.setEnabled(true);
            b13.setEnabled(true);
            b14.setEnabled(true);
            b15.setEnabled(true);
            b16.setEnabled(true);
            b17.setEnabled(true);
            b18.setEnabled(true);
            b19.setEnabled(true);
            b20.setEnabled(true);
            b21.setEnabled(true);
            b22.setEnabled(true);
            b23.setEnabled(true);
            b24.setEnabled(true);
            b25.setEnabled(true);
            b26.setEnabled(true);
            b27.setEnabled(true);
            b28.setEnabled(true);
            b29.setEnabled(true);
            b30.setEnabled(true);
        }
        else if (A.getSource()==b2) {
            tx.setBackground(Color.LIGHT_GRAY);
            tx.setText("OFF");
            
            b1.setEnabled(true);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b26.setEnabled(false);
            b27.setEnabled(false);
            b28.setEnabled(false);
            b29.setEnabled(false);
            b30.setEnabled(false);
        }
        else if (A.getSource()==b3) {
            Double x= Math.pow(Double.parseDouble(tx.getText()), 2);
            tx.setText("");
            tx.setText(tx.getText()+x);
        }   
        else if (A.getSource()==b4) {
            Double x= Math.sqrt(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(tx.getText()+x);
        }
        else if (A.getSource()==b5) {
            try {
               double x= 1/(Double.parseDouble(tx.getText()));
               tx.setText("");
               tx.setText(tx.getText()+x); 
            } catch (Exception e) {
                tx.setText("Math Error");
            }
        }
        else if (A.getSource()==b6) {
            Double x= Math.log(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(tx.getText()+x);
        }
        else if (A.getSource()==b7) {
            tx.setText(tx.getText()+"(");
        }
        else if (A.getSource()==b8) {
            tx.setText(tx.getText()+")");
        }
        else if (A.getSource()==b9) {
            //clear all
            tx.setText("0");
        }
        else if (A.getSource()==b10) {
            //remove last character
            String x= tx.getText();
            tx.setText(x.substring(0, x.length()-1));
        }
        else if (A.getSource()== b27) {
            double x= Math.exp(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(String.valueOf(x));
        }
        else if (A.getSource()== b28) {
            double x= Math.sin(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(tx.getText()+x);
        }
        else if (A.getSource()== b29) {
            double x= Math.cos(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(tx.getText()+x);
        }
        else if (A.getSource()== b30) {
            double x= Math.tan(Double.parseDouble(tx.getText()));
            tx.setText("");
            tx.setText(tx.getText()+x);
        }
        else if (A.getSource()==b11) {
            tx.setText(tx.getText()+"7");
        }
        else if (A.getSource()==b12) {
            tx.setText(tx.getText()+"8");
        }
        else if (A.getSource()==b13) {
            tx.setText(tx.getText()+"9");
        }
        else if (A.getSource()==b14) {
            firstNumber= Double.parseDouble(tx.getText());
            tx.setText("");
            operator="*";
        }
        else if (A.getSource()==b15) {
            tx.setText(tx.getText()+"4");
        }
        else if (A.getSource()==b16) {
            tx.setText(tx.getText()+"5");
        }
        else if (A.getSource()==b17) {
            tx.setText(tx.getText()+"6");
        }
        else if (A.getSource()==b18) {
            firstNumber= Double.parseDouble(tx.getText());
            tx.setText("");
            operator="+";
        }
        else if (A.getSource()==b19) {
            tx.setText(tx.getText()+"1");
        }
        else if (A.getSource()==b20) {
            tx.setText(tx.getText()+"2");
        }
        else if (A.getSource()==b21) {
            tx.setText(tx.getText()+"3");
        }
        else if (A.getSource()==b22) {
            firstNumber=Double.parseDouble(tx.getText());
            tx.setText("");
            operator="-";
        }
        else if (A.getSource()==b23) {
            tx.setText(tx.getText()+".");
        }
        else if (A.getSource()==b24) {
            tx.setText(tx.getText()+"0");
        }
        else if (A.getSource()==b26) {
            firstNumber=Double.parseDouble(tx.getText());
            tx.setText("");
            operator="/";
        }
        else if (A.getSource()==b25) {
            double result;
            secondNumber=Double.parseDouble(tx.getText());
            switch (operator) {
                case "+":
                    result= firstNumber+secondNumber;
                    tx.setText(String.valueOf(result));
                    break;
                case "-":
                    result= firstNumber-secondNumber;
                    tx.setText(String.valueOf(result));
                    break;
                case "*":
                    result= firstNumber*secondNumber;
                    tx.setText(String.valueOf(result));
                    break;
                case "/":
                    if (secondNumber!=0) {
                        result= firstNumber/secondNumber;
                        tx.setText(String.valueOf(result));
                    }
                    else {
                        tx.setText("Math Error!!!");
                    }break;
            } 
        }
    }

    public Calculator(){
        f = new JFrame("CASIO");
        f.setSize(300, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.DARK_GRAY);

        tx= new JTextField(null);
        tx.setBounds(15, 10, 250,50 );
        tx.setEditable(false);
        tx.setFont(new Font("General", Font.BOLD, 20));
        tx.setBackground(Color.LIGHT_GRAY);
        f.add(tx);

        b1= new JButton("ON");
        b1.setBounds(15, 70, 60, 30);
        b1.setBackground(Color.GREEN);
        f.add(b1);
        b1.addActionListener(this);

        b2= new JButton("OFF");
        b2.setBounds(205, 70, 60, 30);
        b2.setBackground(Color.RED);
        f.add(b2);
        b2.addActionListener(this);

        b3= new JButton("x^2");
        b3.setBounds(15, 135, 60, 25);
        b3.setBackground(Color.gray);
        f.add(b3);
        b3.addActionListener(this);

        b4= new JButton("√x");
        b4.setBounds(79, 135, 60, 25);
        b4.setBackground(Color.gray);
        f.add(b4);
        b4.addActionListener(this);

        b5= new JButton("1/x");
        b5.setBounds(143, 135, 60, 25);
        b5.setBackground(Color.gray);
        f.add(b5);
        b5.addActionListener(this);

        b6= new JButton("logX");
        b6.setBounds(207, 135, 59, 25);
        b6.setBackground(Color.gray);
        f.add(b6);
        b6.addActionListener(this);

        b7= new JButton("(");
        b7.setBounds(15, 165, 60, 25);
        b7.setBackground(Color.gray);
        f.add(b7);
        b7.addActionListener(this);

        b8= new JButton(")");
        b8.setBounds(79, 165, 60, 25);
        b8.setBackground(Color.gray);
        f.add(b8);
        b8.addActionListener(this);

        b9= new JButton("C");
        b9.setBounds(143, 165, 60, 25);
        b9.setBackground(Color.PINK);
        f.add(b9);
        b9.addActionListener(this);

        b10= new JButton("D");
        b10.setBounds(207, 165,60 , 25);
        b10.setBackground(Color.PINK);
        f.add(b10);
        b10.addActionListener(this);

        b11= new JButton("7");
        b11.setBounds(15, 205, 60, 40);
        b11.setBackground(Color.WHITE);
        f.add(b11);
        b11.addActionListener(this);

        b12= new JButton("8");
        b12.setBounds(80, 205, 60, 40);
        b12.setBackground(Color.WHITE);
        f.add(b12);
        b12.addActionListener(this);
        
        b13= new JButton("9");
        b13.setBounds(145, 205, 60, 40);
        b13.setBackground(Color.WHITE);
        f.add(b13);
        b13.addActionListener(this);
        
        b14= new JButton("*");
        b14.setBounds(220, 205,45, 40);
        b14.setBackground(Color.ORANGE);
        f.add(b14);
        b14.addActionListener(this);

        b15= new JButton("4");
        b15.setBounds(15, 250, 60, 40);
        b15.setBackground(Color.WHITE);
        f.add(b15);
        b15.addActionListener(this);

        b16= new JButton("5");
        b16.setBounds(80, 250, 60, 40);
        b16.setBackground(Color.WHITE);
        f.add(b16);
        b16.addActionListener(this);

        b17= new JButton("6");
        b17.setBounds(145, 250, 60, 40);
        b17.setBackground(Color.WHITE);
        f.add(b17);
        b17.addActionListener(this);

        b18= new JButton("+");
        b18.setBounds(220, 250, 45, 40);
        b18.setBackground(Color.ORANGE);
        f.add(b18);
        b18.addActionListener(this);

        b19= new JButton("1");
        b19.setBounds(15, 295, 60, 40);
        b19.setBackground(Color.WHITE);
        f.add(b19);
        b19.addActionListener(this);

        b20= new JButton("2");
        b20.setBounds(80, 295, 60, 40);
        b20.setBackground(Color.WHITE);
        f.add(b20);
        b20.addActionListener(this);

        b21= new JButton("3");
        b21.setBounds(145, 295, 60, 40);
        b21.setBackground(Color.WHITE);
        f.add(b21);
        b21.addActionListener(this);

        b22= new JButton("-");
        b22.setBounds(220, 295, 45, 40);
        b22.setBackground(Color.ORANGE);
        f.add(b22);
        b22.addActionListener(this);

        b23= new JButton(".");
        b23.setBounds(15, 340, 45, 40);
        b23.setBackground(Color.ORANGE);
        f.add(b23);
        b23.addActionListener(this);

        b24= new JButton("0");
        b24.setBounds(80, 340, 60, 40);
        b24.setBackground(Color.WHITE);
        f.add(b24);
        b24.addActionListener(this);

        b25= new JButton("=");
        b25.setBounds(160, 340, 45, 40);
        b25.setBackground(Color.ORANGE);
        f.add(b25);
        b25.addActionListener(this);

        b26= new JButton("/");
        b26.setBounds(220, 340, 45, 40);
        b26.setBackground(Color.ORANGE);
        f.add(b26);
        b26.addActionListener(this);

        b27 = new JButton("e^x");
        b27.setBounds(15, 105, 60, 25);
        b27.setBackground(Color.gray);
        f.add(b27);
        b27.addActionListener(this);

        b28 = new JButton("sin");
        b28.setBounds(79, 105, 60, 25);
        b28.setBackground(Color.gray);
        f.add(b28);
        b28.addActionListener(this);

        b29= new JButton("cos");
        b29.setBounds(143, 105, 60, 25);
        b29.setBackground(Color.gray);
        f.add(b29);
        b29.addActionListener(this);

        b30 = new JButton("tan");
        b30.setBounds(207, 105, 59, 25);
        b30.setBackground(Color.gray);
        f.add(b30);
        b30.addActionListener(this);
        
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b26.setEnabled(false);
            b27.setEnabled(false);
            b28.setEnabled(false);
            b29.setEnabled(false);
            b30.setEnabled(false);

        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
 