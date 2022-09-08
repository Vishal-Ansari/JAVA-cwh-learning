import java.awt.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

// class Awtexample1 extends Frame{
//     Awtexample1(){
//         Button b=new Button("click here"); // creating a button
//         b.setBounds(30,100,80,30);// setting button position on the screen
//         add(b);// adding button to the frame
//         setSize(300,300);// setting size of the button

//         setTitle("this is basic of our awt frame");// setting title of the frame
//         setLayout(null);// // no layout manager
//         setVisible(true);// frame will be viisile now
//     }
// }

// public class _27_AWT_button{

//     public static void main(String[] args) {
        
//         Awtexample1 f1= new Awtexample1();
//     }
// }


// -------------------------------------dusra trika--------------------------------------

class awt2{
    awt2(){
        Frame f= new Frame();
        Label l1=new Label("employee id");
        Button b= new  Button("thoko");
        TextField tf1= new TextField();

        l1.setBounds(20,80,80,30);
        b.setBounds(20,100,80,30);
        tf1.setBounds(100,100,80,30);

        f.add(b);
        f.add(l1);
        f.add(tf1);

        f.setSize(400,300);
        f.setTitle("dusra example using frame ");
        f.setVisible(true);
    }
}

public class _27_AWT_button{

    public static void main(String[] args) {
        
        awt2 f1= new awt2();
    }
}