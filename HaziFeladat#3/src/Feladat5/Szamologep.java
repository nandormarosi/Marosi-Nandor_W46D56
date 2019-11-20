package Feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Szamologep extends JFrame implements ActionListener{
    JTextField tx;
    
    JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, Osszeadas, Kivonas;
    JButton Egyenloseg, Osztas, Tizedes, Elojel, Gyok, Tort, Szorzas, Szazalek, Backspace, M, MS, MC, MR, CE, C, Ures;
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    List<Integer> lista = new ArrayList<>();
    public Szamologep() throws HeadlessException{
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tx = new JTextField(30);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        
        Ures = new JButton("");
        Backspace = new JButton("Backspace");
        CE = new JButton("CE");
        C = new JButton("C");
        
        Gyok = new JButton("sqrt");
        Osztas = new JButton("/");
        num9 = new JButton("9");
        num8 = new JButton("8");
        num7 = new JButton("7");
        MC = new JButton("MC");
        
        MR = new JButton("MR");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        Szorzas = new JButton("*");
        Szazalek = new JButton("%");
        
        MS = new JButton("MS");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        Kivonas = new JButton("-");
        Tort = new JButton("1/x");
        
        M = new JButton("M+");
        num0 = new JButton("0");
        Elojel = new JButton("+/-");
        Tizedes = new JButton(".");
        Osszeadas = new JButton("+");
        Egyenloseg = new JButton("=");
        
        GridLayout gr = new GridLayout(6, 1);
        setLayout(gr);
        GridLayout gr2 = new GridLayout(1, 1);
        panel1.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1, 4);
        panel2.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 6);
        panel3.setLayout(gr4);
        GridLayout gr5 = new GridLayout(1, 6);
        panel4.setLayout(gr5);
        GridLayout gr6 = new GridLayout(1, 6);
        panel5.setLayout(gr6);
        GridLayout gr7 = new GridLayout(1, 6);
        panel6.setLayout(gr7);
        
        panel1.add(tx);
        panel2.add(Ures);
        panel2.add(Backspace);
        panel2.add(CE);
        panel2.add(C);
        
        panel3.add(MC);
        panel3.add(num7);
        panel3.add(num8);
        panel3.add(num9);
        panel3.add(Osztas);
        panel3.add(Gyok);
        
        panel4.add(MR);
        panel4.add(num4);
        panel4.add(num5);
        panel4.add(num6);
        panel4.add(Szorzas);
        panel4.add(Szazalek);
        
        panel5.add(MS);
        panel5.add(num1);
        panel5.add(num2);
        panel5.add(num3);
        panel5.add(Kivonas);
        panel5.add(Tort);
        
        panel6.add(M);
        panel6.add(num0);
        panel6.add(Elojel);
        panel6.add(Tizedes);
        panel6.add(Osszeadas);
        panel6.add(Egyenloseg);
        
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        Egyenloseg.addActionListener(this);
        Osszeadas.addActionListener(this);
        C.addActionListener(this);
        
        pack();
    }
    public static void main(String[] args) {
        Szamologep sz = new Szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int osszeg = 0;
        if(e.getSource() == num0){
            tx.setText("0");
        }
        if(e.getSource() == num1){
            tx.setText("1");
        }
        if(e.getSource() == num2){
            tx.setText("2");
        }
        if(e.getSource() == num3){
            tx.setText("3");
        }
        if(e.getSource() == num4){
            tx.setText("4");
        }
        if(e.getSource() == num5){
            tx.setText("5");
        }
        if(e.getSource() == num6){
            tx.setText("6");
        }
        if(e.getSource() == num7){
            tx.setText("7");
        }
        if(e.getSource() == num8){
            tx.setText("8");
        }
        if(e.getSource() == num9){
            tx.setText("9");
        }
        if(e.getSource() == Osszeadas){
            lista.add(Integer.parseInt(tx.getText()));
            tx.setText("");
        }
        if(e.getSource() == Egyenloseg){
            lista.add(Integer.parseInt(tx.getText()));
            tx.setText("");
            for (int i = 0; i < lista.size(); i++) {
                osszeg += lista.get(i);
            }
            tx.setText("" + osszeg);
        }
        if(e.getSource() == C){
            tx.setText("");
        }
    }
}
