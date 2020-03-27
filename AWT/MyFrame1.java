import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame{
MyFrame1(){
Button b1=new Button("click1");
Button b2=new Button("click 2");
Button b3=new Button("click3");
Button b4=new Button("click 4");
Button b5=new Button("click5");
Button b6=new Button("click 6");
Button b7=new Button("click7");
Button b8=new Button("click 8");
b1.setBounds(30,100,80,30);// setting button position for b1 you can set remaining
add(b1);
setVisible(true);/* add(b2);add(b3);add(b4);
//adding button into frame
add(b5);add(b6);add(b7);add(b8);
//setLayout( new FlowLayout());// calling any one of the following statement in this group and see the
difference
//setLayout( new GridLayout(2,4));// change this without any value or putting different row and column
values as (2,4),(4,2) etc
//setLayout(new
*/
//GridBagLayout() );/*Run the program with red colour statements, observe the result. After remove it and put the
//statements in purple colour and execute black colour statements should be kept in all cases*/
/*setLayout(new BorderLayout());
add( b1, BorderLayout.NORTH);
add (b2, BorderLayout.SOUTH);
add(b3 , BorderLayout.EAST);
add ( b4, BorderLayout.CENTER);
add( b5, BorderLayout. WEST);*/
setSize(300,300);//frame size 300 width and 300 height try with different values
setTitle("MyFrame");
setVisible(true);//now frame will be visible, by default not visible
}
public static void main(String args[]){
MyFrame1 f=new MyFrame1();
}}
