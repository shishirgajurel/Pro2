public class CounterDecrementer implements Runnable
{
  private int updates;
  private Counter counter;

  public CounterDecrementer(Counter counter, int updates){
    this.counter = counter;
    this.updates = updates;
  }

  @Override public void run()
  {
    try
    {
      for (int i = 0; i<= updates; i++){
        counter.decrement();
      }
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
    System.out.println(counter.getValue() + "Counter Drecementer");
  }
}
