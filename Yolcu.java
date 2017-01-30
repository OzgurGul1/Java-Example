package BiletSat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Yolcu implements ActionListener {

    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Yolcu().createGui();
            }
        });

    }

    public void createGui() {
        JFrame frame = new JFrame("Yolcu Durumu");
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel(new GridBagLayout());
        frame.add(pane);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        GridBagConstraints c = new GridBagConstraints();
        JButton button;

        int say = 0;
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.println("a b = " + i + " " + j);
                say = say + 1;
                button = new JButton(say + ".Koltuk");

                if (shouldWeightX) {
                    c.weightx = 0.5;
                }
                if (say < 48) {
                    c.fill = GridBagConstraints.HORIZONTAL;
                    c.gridx = j;
                    c.gridy = i;

                    // button.addActionListener(listen);
                    pane.add(button, c);
                    button.addActionListener(this);
                }

            }

        }

    }

    public void actionPerformed(ActionEvent e) {
        JFrame frame2 = new JFrame(e.getActionCommand());
        frame2.setVisible(true);
        frame2.setSize(600, 600);
        JLabel label = new JLabel(e.getActionCommand());
        JPanel panel = new JPanel();
        frame2.add(panel);
        panel.add(label);
    }
}
