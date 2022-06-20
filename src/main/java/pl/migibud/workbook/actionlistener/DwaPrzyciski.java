package pl.migibud.workbook.actionlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.EventListener;

public class DwaPrzyciski {

    JFrame ramka;
    JLabel etykieta;

    public static void main(String[] args) {
        DwaPrzyciski gui = new DwaPrzyciski();
        gui.doRoboty();
    }

    public void doRoboty(){
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton przyciskEtyk = new JButton("Zmień etykietę");
//        przyciskEtyk.addActionListener(e -> etykieta.setText("Auuuuu !"));
        przyciskEtyk.addActionListener(new EtykietaListener());

        JButton przyciskKolor = new JButton("Zmień kolor");
        przyciskKolor.addActionListener(e -> ramka.repaint());

        etykieta = new JLabel("Oto etykieta");

        ramka.getContentPane().add(BorderLayout.SOUTH,przyciskKolor);
        ramka.getContentPane().add(BorderLayout.EAST,przyciskEtyk);
        ramka.getContentPane().add(BorderLayout.WEST,etykieta);

        ramka.setSize(400,300);
        ramka.setVisible(true);
    }

    private class EtykietaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            etykieta.setText("Auuuuu !");
        }
    }


}
