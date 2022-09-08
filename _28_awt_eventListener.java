import java.awt.*;
import java.awt.event.*;

public class _28_awt_eventListener extends Frame implements ActionListener {
    TextField tf;

    _28_awt_eventListener() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("lick here");
        b.setBounds(100, 120, 80, 30);

        b.addActionListener(this);

        add(b);
        add(tf);
        setSize(300, 400);

        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){  
        tf.setText("Welcome");  
        }  
        public static void main(String args[]){  
        new _28_awt_eventListener();  
        }  
}
