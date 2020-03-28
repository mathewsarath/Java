import java.awt.*;
import java.awt.event.*;
/* execute this program and check this by minimizing, maximizing frame several times and at lat close and
see the output*/
public class MyFrame2 extends Frame implements WindowListener{
MyFrame2(){
addWindowListener(this);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
new MyFrame2();
}
/* MyFrame implements WindowListener hence all 7 functions must be defined below */
public void windowActivated(WindowEvent e) {System.out.println("Window Activated");}
public void windowClosed(WindowEvent e) {
System.out.println("Window Closed");
}
public void windowClosing(WindowEvent e) {
System.out.println("Window is Closing");
dispose();
}
public void windowDeactivated(WindowEvent e) {System.out.println("Window Deactivated");}
public void windowDeiconified(WindowEvent e) {System.out.println("Window Deiconified");}
public void windowIconified(WindowEvent e) {System.out.println("Window iconified");}
public void windowOpened(WindowEvent e) {System.out.println("Window opened");}
}