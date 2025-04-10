package via.exercise.pro2.threads;

public class Start
{
  public static void main(String[] args)
  {
    MyFirstThread myFirstThread = new MyFirstThread();
    //start the new thread
    myFirstThread.run();
    System.out.println("This is from Main!");
   // MyFirstRunnable myFirstRunnable = new MyFirstRunnable();

   // myFirstRunnable.run();


  }
}
