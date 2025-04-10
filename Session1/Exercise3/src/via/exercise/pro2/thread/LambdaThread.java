package via.exercise.pro2.thread;

public class LambdaThread
{
  public static void main(String[] args)
  {
    Thread lt = new Thread(()->{
      System.out.println("It Started ..");
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException ie){
        ie.printStackTrace();

      }
      System.out.println("Our lambda expression ended");

    });
    lt.start();

    //let the main thread wait

    try{
      System.out.println("Main thread - waiting for lt to be done .....");
      lt.join();
      System.out.println("Main thread continues");
    }
    catch (InterruptedException ie){
      ie.printStackTrace();
    }


  }

}
