# Some-Java-Programs
Some basic java programs 
package abstractclassexample1;

abstract class Gameconsole{
int i=10;
 void display(){
System.out.println("The score is");
}
 abstract void playgame();
 public abstract void playgame2();

}
class A extends Gameconsole {
    void start(){
System.out.println("GAME Started");
    }
   void  playgame(){
   System.out.println("Lets play the Game");
   }

   
    public void playgame2() {
      System.out.println("Lets play the Game 2");
    }
   
}
class B extends A {

    @Override
    void playgame() {
      System.out.println("Lets play the Game  in A");

    }

    @Override
    public void playgame2() {
         System.out.println("Lets play the Game 2 in B");
         display();
         start();
         
 }
}
public class Abstractclassexample1 {
    public static void main(String[] args) {
    B b=new B();
    b.playgame2();
    }
    
}
