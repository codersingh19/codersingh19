import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent.*;
public class main extends KeyAdapter{
    Label l;
    main(Label l) {
        this.l = l;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        l.setText(("typed character is :" +e.getKeyChar()));
    }
    @Override
    public void keyPressed(KeyEvent e ) {
        System.out.println("Pressed character is "+e.getKeyChar ());
    }
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released character is" +e.getKeyChar());
    }
}
class main1 extends Frame{
    Label l;
    main1() {
        super("AWT Keyboard");
        l = new Label("");
        l.setBounds(25,60,250,30);
        l.setAlignment(Label.CENTER);
        this.add(l);
        this.addKeyListener(new main(l));
        this.setSize(300,100);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new main1();
    }
}