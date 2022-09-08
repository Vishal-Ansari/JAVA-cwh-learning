import java.awt.*;
import java.awt.event.*;



public class _29_button {
    public static void main(String[] args) {
        Frame f=new Frame("Button EXample");
        final TextField tf1= new TextField();
        tf1.setBounds(100,70,300,50);

        Button b1=new Button();
        b1.setLabel("dabao");

        b1.setBounds(100,150,100,50);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf1.setText("hoggya bss dabadia button");
            }
        });

        f.add(b1);
        f.add(tf1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
