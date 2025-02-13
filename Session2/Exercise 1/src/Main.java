public class Main {

  public static void main(String[] args)
  {
    Counter counter = new Counter(10,200);

    CounterIncrementer counterIncrementer = new CounterIncrementer(counter, 10);
    CounterIncrementer counterIncrementer1 = new CounterIncrementer(counter,20);
    CounterDecrementer counterDecrementer = new CounterDecrementer(counter, 10);
    CounterDecrementer counterDecrementer1 = new CounterDecrementer(counter, 40);

    Thread thread = new Thread(counterIncrementer, "Counter Increment 1");
    Thread thread1 = new Thread(counterIncrementer1, "Counter Increment 2");
   Thread thread2 = new Thread(counterDecrementer, "Counter Decrement 1");
    Thread thread3 = new Thread(counterDecrementer1, "Counter Decrement 2");

   thread.start();
    thread1.start();
   thread2.start();
    thread3.start();
    System.out.println(Thread.currentThread().getName() + " : " + counter.getValue());
  }
}
