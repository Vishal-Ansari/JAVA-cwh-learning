import java.awt.*;



public class _33menubar {
    _33menubar(){
        Frame f=new Frame("menubar");
        MenuBar mb=new MenuBar();
        Menu menu= new Menu("menu h");
        Menu submMenu= new Menu("Sub-menu");

        MenuItem i1=new MenuItem("item 1");
        MenuItem i2=new MenuItem("item 2");
        MenuItem i3=new MenuItem("item 3");
        MenuItem i4=new MenuItem("item 4");
        MenuItem i5=new MenuItem("item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submMenu.add(i4);
        submMenu.add(i5);
        menu.add(submMenu);
        mb.add(menu);

        f.setMenuBar(mb); 
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

    }
    public static void main(String[] args) {
        new _33menubar();
    }
}
