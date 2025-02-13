public class Counter
{
  private long value;
  private long max;
  private long min;

  public Counter(long min, long max){
    this.max = max;
    this.min = min;
    value =0;
  }
  public synchronized void increment(){

    if (value>=max){
      try{
        wait();
      }
      catch (InterruptedException interruptedException){
        interruptedException.printStackTrace();
      }

    }
    value++;
    notifyAll();
  }
  public synchronized   void decrement(){

    if (value<=min){
      try{
        wait();
      }
      catch (InterruptedException interruptedException){
        interruptedException.printStackTrace();
      }
    }
    value--;
    notifyAll();
  }
  public synchronized long getValue(){
    return value;
  }
}
