package prviZadatak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator implements ActionListener {

    JFrame prozor;
    JLabel natpis;
    JTextField tekstPolje;
    JButton[] buttons = new JButton[10];
    JButton[] funkcijskeTipke = new JButton[9];
    JButton zbrajanjeB, oduzimanjeB, mnozenjeB, djeljenjeB;
    JButton decB, jednakoB, obrisiB, ocistiB, negB;
    JPanel panel;

    Font f = new Font(Font.MONOSPACED, Font.BOLD, 25);

    double brojPrvi = 0, brojDrugi = 0, rez = 0;
    char operator;

    public Kalkulator() {

        prozor = new JFrame("Kalkulator");
        natpis = new JLabel("Kalkulator");

        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.setSize(420, 550);
        prozor.setLayout(null);

        tekstPolje = new JTextField();
        tekstPolje.setBounds(50, 25, 300, 50);
        tekstPolje.setFont(f);
        tekstPolje.setEditable(false);
        prozor.add(tekstPolje);

        zbrajanjeB = new JButton("+");
        oduzimanjeB = new JButton("-");
        mnozenjeB = new JButton("*");
        djeljenjeB = new JButton("/");
        decB = new JButton(".");
        jednakoB = new JButton("=");
        obrisiB = new JButton("DEL");
        ocistiB = new JButton("CLR");
        negB = new JButton("(-)");

        funkcijskeTipke[0] = zbrajanjeB;
        funkcijskeTipke[1] = oduzimanjeB;
        funkcijskeTipke[2] = mnozenjeB;
        funkcijskeTipke[3] = djeljenjeB;
        funkcijskeTipke[4] = decB;
        funkcijskeTipke[5] = jednakoB;
        funkcijskeTipke[6] = obrisiB;
        funkcijskeTipke[7] = ocistiB;
        funkcijskeTipke[8] = negB;

        for (JButton jButton : funkcijskeTipke) {
            jButton.addActionListener(this);
            jButton.setFont(f);
            jButton.setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].addActionListener(this);
            buttons[i].setFont(f);
            buttons[i].setFocusable(false);
        }

        negB.setBounds(50, 430, 100, 50);
        obrisiB.setBounds(150, 430, 100, 50);
        ocistiB.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        panel.add(zbrajanjeB);

        panel.add(buttons[4]);
        panel.add(buttons[5]);
        panel.add(buttons[6]);
        panel.add(oduzimanjeB);

        panel.add(buttons[7]);
        panel.add(buttons[8]);
        panel.add(buttons[9]);
        panel.add(mnozenjeB);

        panel.add(decB);
        panel.add(buttons[0]);
        panel.add(jednakoB);
        panel.add(djeljenjeB);


        prozor.add(panel);
        prozor.add(negB);
        prozor.add(obrisiB);
        prozor.add(ocistiB);
        prozor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //provjeravamo ako je neki od brojeva kliknut
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == buttons[i]) {
                tekstPolje.setText(tekstPolje.getText().concat(String.valueOf(i)));
            }
        }

        // dodajemo decimalnu tocku broju
        if (e.getSource() == decB) {
            tekstPolje.setText(tekstPolje.getText().concat("."));
        }

        // kad user stisni na zbrajanje onda pamtimo prvi broj i brisemo tekstualno polje
        if (e.getSource() == zbrajanjeB) {
            brojPrvi = Double.parseDouble(tekstPolje.getText());
            operator = '+';
            tekstPolje.setText("");
        }

        if (e.getSource() == oduzimanjeB) {
            brojPrvi = Double.parseDouble(tekstPolje.getText());
            operator = '-';
            tekstPolje.setText("");
        }

        if (e.getSource() == mnozenjeB) {
            brojPrvi = Double.parseDouble(tekstPolje.getText());
            operator = '*';
            tekstPolje.setText("");
        }

        if (e.getSource() == djeljenjeB) {
            brojPrvi = Double.parseDouble(tekstPolje.getText());
            operator = '/';
            tekstPolje.setText("");
        }

        // kad stisnemo jednako provejramo koji je operator i vrsimo tu operaciju
        if (e.getSource() == jednakoB) {
            brojDrugi = Double.parseDouble(tekstPolje.getText());

            switch (operator) {
                case '+' -> rez = brojPrvi + brojDrugi;
                case '-' -> rez = brojPrvi - brojDrugi;
                case '*' -> rez = brojPrvi * brojDrugi;
                case '/' -> rez = brojPrvi / brojDrugi;
            }

            tekstPolje.setText(String.valueOf(rez));
            brojPrvi = rez;
        }

        if (e.getSource() == ocistiB) {
            tekstPolje.setText("");
        }

        if (e.getSource() == obrisiB) {
            String tekst = tekstPolje.getText();
            tekstPolje.setText("");

            for (int i = 0; i < tekst.length() - 1; i++) {
                tekstPolje.setText(tekstPolje.getText() + tekst.charAt(i));
            }
        }

        if (e.getSource() == negB) {
            double temp = Double.parseDouble(tekstPolje.getText());
            temp *= -1;
            tekstPolje.setText(String.valueOf(temp));
        }
    }
}
