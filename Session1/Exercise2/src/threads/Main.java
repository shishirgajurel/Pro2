package threads;

import runnable.CharacterRunner;
import runnable.NumberRunner;

public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
//
//    CharacterRunner characterRunner = new CharacterRunner();
//    CharacterRunner characterRunner1 = new CharacterRunner();
//    NumberRunner numberRunner = new NumberRunner();
//    NumberRunner numberRunner1 = new NumberRunner();
//
//
//    characterRunner.run();
//    characterRunner1.run();
//    numberRunner.run();
//    numberRunner1.run();

    Runnable characterRunner = new CharacterRunner();
    Runnable numberRunner = new NumberRunner();
    Thread numberThread = new Thread(numberRunner);
    Thread characterThread = new Thread(characterRunner);

    numberThread.start();
    characterThread.start();
    numberThread.join();
    characterThread.join();

    System.out.println(Thread.currentThread().getName());

  }
}