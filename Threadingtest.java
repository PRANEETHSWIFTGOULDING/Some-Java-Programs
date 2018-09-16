package threadingtest;

class A extends Thread
{

public void run(){
System.out.println("In Run");
}
}
class B extends Thread{
public void run(){
int a;
a=5+5;
System.out.println("The value of a is: " +a);
}
}
public class Threadingtest{
public static void main(String[] args) throws InterruptedException 
    {
 A tobj=new A();
 tobj.start();
 System.out.println("Run:"+tobj.isAlive());
 B obj=new B();
 obj.start();
for(int i=0;i<10;i++)

{System.out.println("Helloo..!!!");

Thread.sleep(500);
}

         }

    
    
}
  

    