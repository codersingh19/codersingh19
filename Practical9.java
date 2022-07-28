import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class Practical9 extends Frame {
    Label l;

    Practical9() {
        super("AWT Pink");
        l = new Label("This is a Label");
        l.setBounds(25, 050, 250, 30);
        l.setAlignment(Label.CENTER);
        this.add(l);
        this.setBackground(Color.pink);
        this.setSize(300, 100);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Practical9();
    }
}
