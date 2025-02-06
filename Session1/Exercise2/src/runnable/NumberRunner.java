package runnable;

public class NumberRunner implements Runnable
{

  public NumberRunner(){

  }

  @Override public void run()
  {
    for (int i = 0; i < 20000; i++)
    {
      System.out.println(i);
    }
  }
}
