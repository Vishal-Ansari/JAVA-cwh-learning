import java.awt.*;

import javax.swing.text.AttributeSet.ColorAttribute;

class my extends Canvas{
  public my(){
    setBackground(Color.GRAY);
    setSize(500,500);
  }

public void paint(Graphics g){
  g.drawOval(80,70,150,150);
  g.setColor(Color.BLACK);
  g.fillOval(120,120,15,15);
  g.fillOval(150,120,15,15);
  g.drawArc(150, 100, 50, 10, 180, 180);

}

}

class abcd{
 abcd(){
  Frame f=new Frame();
  my m1=new my();
  f.add(m1);
  f.setLayout(null);
  f.setSize(800,800);
  f.setVisible(true);
 }

  public static void main(String[] args) {
    new abcd();
  }
}