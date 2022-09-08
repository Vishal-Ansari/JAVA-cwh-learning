import java.awt.*;
import java.awt.event.*;

public class _30calculator extends Frame implements ActionListener {

TextField t1,t2,t3;
Button b1,b2;

_30calculator(){

    t1=new TextField("Enter no 1");
    t1.setBounds(50,50,150,20);

    t2=new TextField("enter no 2");
    t2.setBounds(50,100,150,20);
    
    t3=new TextField("result is");
    t3.setBounds(50,150,150,20);
    t3.setEditable(false);

    b1=new Button("add");
    b1.setBounds(50,200,50,50);
    b2=new Button("sub");
    b2.setBounds(120,200,50,50);

    b1.addActionListener(this);
    b2.addActionListener(this);

    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);

    setSize(300,300);
    setLayout(null);
    setVisible(true);
}

  public void actionPerformed(ActionEvent e){
     String s1=t1.getText();
     String s2=t2.getText();

     int a=Integer.parseInt(s1);
     int b=Integer.parseInt(s2);

     int c=0;
     if(e.getSource()==b1)
     c=a+b;
     else if(e.getSource()==b2)
     c=a-b;

     String result=String.valueOf(c);
     t3.setText(result);
  }  

  public static void main(String[] args) {
      new _30calculator();
  }
}
