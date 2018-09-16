package atomicintegervariable;

import java.util.concurrent.atomic.AtomicInteger;
public class Atomicintegervariable {
    public static void main(String[] args) {
    AtomicInteger value=new AtomicInteger(5);
    System.out.println("intial value"+value.get());
    value.getAndIncrement();
        System.out.println("value after incrementing"+value.get());
value.set(40);
    System.out.println("value after setting"+value.get());
value.getAndDecrement();
    System.out.println("value after setting and decrementing"+value.get());
value.getAndIncrement();
    System.out.println("value after reincrementing"+value.get());

    value.compareAndSet(40, 45);
    System.out.println("value after compare and setting"+value.get());

    }
    
}
