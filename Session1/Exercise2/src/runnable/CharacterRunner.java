package runnable;

public class CharacterRunner implements Runnable
{

  public CharacterRunner(){

  }

  @Override public void run()
  {
    for(int i = 0; i < 25; i++) {
      for (char c = 'A'; c <= 'Z'; c++) {
        System.out.println(c);
      }
    }
  }
}
