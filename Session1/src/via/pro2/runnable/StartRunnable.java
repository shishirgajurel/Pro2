package via.pro2.runnable;

public class StartRunnable
{
  public static void main(String[] args)
  {
    MyFirstRunnable myFirstRunnable = new MyFirstRunnable();
    Thread thread = new Thread(myFirstRunnable);
    //Start the thread
    thread.start();
  }
}
