import java.awt.*;
import java.awt.event.*;
public class Practical10 extends Frame implements ActionListener {
    Button btnblue,btnred;
    Practical10(){
    super("AWT Buttons");
    btnred = new Button("Red");
    btnred.setBounds(25,50,250,30);
    btnred.addActionListener(this);
    this.add(btnred);
    btnblue = new Button("Blue");
    btnblue.setBounds(25,100,250,30);
    btnblue.addActionListener(this);
    this.add(btnblue);
    this.setSize(300,160);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    });
        }
        public static void Practical10(String[] args) {
           new Practical10();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnred) {
                this.setBackground(Color.red);
            } else if (e.getSource() == btnblue) {
                this.setBackground(Color.blue);
            } 
                
            }
        
    }



