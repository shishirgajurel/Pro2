package counter;

public class Counter
{
  private long value;
  public Counter(){
    this.value = 0;
  }
  public void increment(){
    //Synchronize on the Counter Object
    synchronized (this){
      value++;
    }
  }
  //we can  synchronize by the two-way by doing synchronized (this){
  //      value++;
  //    }
  public synchronized long getValue(){
      return value;
  }
}
