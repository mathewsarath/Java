import java.awt.*;
import java.awt.event.*;
public class MyFrameAdapt extends WindowAdapter{
Frame f;
MyFrameAdapt(){
f=new Frame();
f.addWindowListener(this);f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void windowClosing(WindowEvent e) {
System.out.println("closing");
f.dispose();
}
public static void main(String[] args) {
new MyFrameAdapt();
}
}