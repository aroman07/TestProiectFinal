//Ioana a modificat ceva
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JPanel panel;
    private JButton buton;

    public MainWindow() {
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //instructiuni care sa se execute la click
                buton.setBackground(Color.GREEN);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicatie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainWindow().panel);

        frame.pack();
        frame.setVisible(true);
    }
}
