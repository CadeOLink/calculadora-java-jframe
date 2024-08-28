package CalculadoraJFrame;

import AulaMain.telajframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadorajframe extends JFrame implements ActionListener{
    JLabel lResult;
    JTextField tfFrameOne, tfFrameTwo;
    JButton jbSomar, jbMultiplicar, jbDividir, jbSubtrair, jbC, jbExit;

    public calculadorajframe(){
        setLayout(new FlowLayout());

        lResult = new JLabel("Resultado:");
        tfFrameOne = new JTextField(15);
        tfFrameTwo = new JTextField(15);
        jbSomar = new JButton("+");
        jbSubtrair = new JButton("-");
        jbMultiplicar = new JButton("x");
        jbDividir = new JButton("/");
        jbExit = new JButton("Exit");
        jbC = new JButton("C");

        jbSomar.addActionListener(this);
        jbSubtrair.addActionListener(this);
        jbMultiplicar.addActionListener(this);
        jbDividir.addActionListener(this);
        jbExit.addActionListener(this);
        jbC.addActionListener(this);

        add(lResult);
        add(tfFrameOne);
        add(tfFrameTwo);
        add(jbSomar);
        add(jbSubtrair);
        add(jbMultiplicar);
        add(jbDividir);
        add(jbC);
        add(jbExit);

        super.setExtendedState(MAXIMIZED_BOTH);
        super.setVisible(true);
        super.setTitle("Calculadora JFrame - POO-BCCII");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbExit){
            System.exit(0);
        }
        if(e.getSource() == jbC){
            lResult.setText("Resultado:");
            tfFrameOne.setText("");
            tfFrameTwo.setText("");
        }
        if(e.getSource() == jbSomar){
            double res = Double.parseDouble(tfFrameOne.getText()) + Integer.parseInt(tfFrameTwo.getText());
            lResult.setText("Resultado: "+String.valueOf(res));

        }
        if(e.getSource() == jbSubtrair){
            double res = Double.parseDouble(tfFrameOne.getText()) - Integer.parseInt(tfFrameTwo.getText());
            lResult.setText("Resultado: "+String.valueOf(res));

        }
        if(e.getSource() == jbMultiplicar){
            double res = Double.parseDouble(tfFrameOne.getText()) * Integer.parseInt(tfFrameTwo.getText());
            lResult.setText("Resultado: "+String.valueOf(res));

        }
        if(e.getSource() == jbDividir){
            double res = Double.parseDouble(tfFrameOne.getText()) / Integer.parseInt(tfFrameTwo.getText());
            lResult.setText("Resultado: "+String.valueOf(res));

        }
    }

    public static void main(String[] args) {
        calculadorajframe app = new calculadorajframe();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
