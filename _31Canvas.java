import java.awt.*;

class Mycanvas extends Canvas{
    public Mycanvas(){
        setBackground(Color.GRAY);
        setSize(300,200);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 70);
    }
}


public class _31Canvas{

 public _31Canvas(){
     Frame f=new Frame("canvas frame");
     f.add(new Mycanvas());

     f.setLayout(null);
     f.setSize(400,400);
     f.setVisible(true);
 }

    public static void main(String[] args) {
        new _31Canvas();
    }
}