import java.awt.*;
import java.awt.event.*;
public class MyFrameAnon extends Frame{
MyFrameAnon(){
setSize(300,300);//frame size 300 width and 300 height try with different values
setTitle("MyFrame");
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e) {
System.out.println("Window Closing");
dispose();
}
});
setVisible(true);//now frame will be visible, by default not visible
}
public static void main(String args[]){
MyFrameAnon f=new MyFrameAnon();
}}
