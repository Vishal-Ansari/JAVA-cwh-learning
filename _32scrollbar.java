import java.awt.*;

import javax.swing.plaf.ScrollBarUI;

public class _32scrollbar {
     _32scrollbar(){
        Frame f=new Frame("Scrollbar");

        Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

     }
     public static void main(String[] args) {
        new _32scrollbar();
     }
}
