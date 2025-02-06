package via.pro2.runnable;

public class LambdaRunnable
{
  public static void main(String[] args)
  {
    Runnable myLambdaRunnable = () -> System.out.println("This is from lambda runnable");
    Thread thread = new Thread(myLambdaRunnable);
    thread.start();
  }
}
