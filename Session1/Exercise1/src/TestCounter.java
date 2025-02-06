public class TestCounter
{
  public static void main(String[] args) throws InterruptedException
  {
    Counter counter = new Counter();
    CounterIncrementer incrementer = new CounterIncrementer(counter, 200000);
    CounterIncrementer incrementer1 = new CounterIncrementer(counter, 200000);
    CounterIncrementer incrementer2 = new CounterIncrementer(counter, 200000);
    Thread thread = new Thread(incrementer, "Incrementer 1");
    Thread thread1 = new Thread(incrementer1, "Incrementer 2");
    Thread thread2 = new Thread(incrementer1, "Incrementer 2");
    thread.start();
    thread.sleep(200);
    thread1.start();
    thread.join();
    thread1.sleep(200);
    thread2.start();
    thread2.sleep(200);
    thread.join();
    System.out.println(Thread.currentThread().getName() + " : " + counter.getValue());
  }
}
