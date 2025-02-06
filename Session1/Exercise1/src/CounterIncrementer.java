public class CounterIncrementer implements Runnable
{
  private int updates;
  private Counter counter;
  public CounterIncrementer(Counter counter, int updates){
    this.counter = counter;
    this.updates = updates;
  }

  @Override public void run()
  {
    for (int i = 0; i < 200000; i++)
    {
      counter.increment();

    }
    System.out.println(Thread.currentThread().getName() + " : " + counter.getValue());
    System.out.println("THis is counter incrementer");
  }
}
