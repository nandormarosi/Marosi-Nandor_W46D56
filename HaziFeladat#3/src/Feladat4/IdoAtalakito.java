package Feladat4;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IdoAtalakito extends JFrame implements ActionListener {

    public static void main(String[] args) {
        IdoAtalakito a = new IdoAtalakito();
    }

    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12;
    JPanel panel1, panel2, panel3, panel4;
    JTextField tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10, tx11, tx12;
    JButton gomb1;

    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        gomb1 = new JButton("Számol");

        tx1 = new JTextField(5);
        tx2 = new JTextField(5);
        tx3 = new JTextField(5);
        tx4 = new JTextField(5);
        tx5 = new JTextField(5);
        tx6 = new JTextField(5);
        tx7 = new JTextField(5);
        tx8 = new JTextField(5);
        tx9 = new JTextField(5);
        tx10 = new JTextField(5);
        tx11 = new JTextField(5);
        tx12 = new JTextField(5);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(1, 4);
        panel1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 4);
        panel2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1, 1);
        panel3.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 4);
        panel4.setLayout(gr4);

        gomb1.addActionListener(this);

        panel1.add(tx1);
        panel1.add(lb1);
        panel1.add(tx2);
        panel1.add(lb2);
        panel1.add(tx3);
        panel1.add(lb3);
        panel1.add(tx4);
        panel1.add(lb4);

        panel2.add(tx5);
        panel2.add(lb5);
        panel2.add(tx6);
        panel2.add(lb6);
        panel2.add(tx7);
        panel2.add(lb7);
        panel2.add(tx8);
        panel2.add(lb8);

        panel3.add(gomb1);

        panel4.add(tx9);
        panel4.add(lb9);
        panel4.add(tx10);
        panel4.add(lb10);
        panel4.add(tx11);
        panel4.add(lb11);
        panel4.add(tx12);
        panel4.add(lb12);

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gomb1) {
            int nap = Integer.parseInt(tx1.getText());
            int nap_1 = Integer.parseInt(tx5.getText());

            int ora = Integer.parseInt(tx2.getText());
            int ora_1 = Integer.parseInt(tx6.getText());

            int perc = Integer.parseInt(tx3.getText());
            int perc_1 = Integer.parseInt(tx7.getText());

            int masodperc = Integer.parseInt(tx4.getText());
            int masodperc_1 = Integer.parseInt(tx8.getText());

            int result_nap = 0;
            int result_ora = 0;
            int result_perc = 0;
            int result_masodperc = 0;

            if (masodperc + masodperc_1 > 60) {
                result_masodperc = masodperc + masodperc_1 - 60;
                tx12.setText("" + result_masodperc);
                result_perc = 1;
            } else {
                result_masodperc = result_masodperc + masodperc + masodperc_1;
                tx12.setText("" + result_masodperc);
            }

            if (perc + perc_1 > 60) {
                result_perc = result_perc + perc + perc_1 - 60;
                result_ora = 1;
                tx11.setText("" + result_perc);
            } else {
                result_perc = result_perc + perc + perc_1;
                tx11.setText("" + result_perc);
            }

            if (ora + ora_1 > 24) {
                result_nap = 1;
                result_ora = result_ora + ora + ora_1 - 24;
                tx10.setText("" + result_ora);
            } else {
                result_ora = result_ora + ora + ora_1;
                tx10.setText("" + result_ora);
            }
            result_nap = result_nap + nap + nap_1;
            tx9.setText("" + result_nap);
        }
    }
}
