package threadcreationbyextendingthreadclass;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.color.*;
import java.awt.font.*;
public class Threadcreationbyextendingthreadclass extends Thread {
JTextField jtf;
JFrame jf;
JLabel jl;
public void run(){
buildGUI();
}
void display()
{
for(int i=0;i<=60;i++){
    try{
Thread.sleep(1000);
    
     jtf.setText(i+"seconds to go");
    }
catch(Exception e){
        System.out.println(e);
}
}

JOptionPane.showMessageDialog(jf,"Time uppp!!!");
jtf.setText("");
jtf.setEditable(false);
}
    public void buildGUI() {
    jf=new JFrame("CountDown Timer");
    JPanel jp=new JPanel();
    jtf=new JTextField(20);
    jtf.setEnabled(false);
    Font f=new Font("Verdana",0,18);
    jtf.setFont(f);
jtf.setBackground(Color.red);
    jf.add(jtf);
    jf.setVisible(true);
    jf.setSize(800, 800);
    display();
    }


public static void main(String[] args) {
 Threadcreationbyextendingthreadclass obj=new Threadcreationbyextendingthreadclass();
 obj.start();
}


   
    
}
