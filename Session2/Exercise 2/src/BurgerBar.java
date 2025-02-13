public class BurgerBar {
    private int numberOfBurgers = 0;
    private int maxNumberOfBurgers;

    public BurgerBar(int maxNumberOfBurgers){
        this.maxNumberOfBurgers = maxNumberOfBurgers;
    }
    public synchronized void makeBurger(String employeeName) throws InterruptedException {
    if (numberOfBurgers>=maxNumberOfBurgers){
        wait();
    }
    numberOfBurgers++;
        System.out.println(employeeName + " made a burger. Total burgers: " + numberOfBurgers);
        notifyAll();
    }
    public synchronized void eatBurger(String who) throws InterruptedException {
        if (numberOfBurgers<=0){
            wait();
        }
        numberOfBurgers--;
        System.out.println(who + " ate a burger. Total burgers: " + numberOfBurgers);
        notifyAll();
    }


    public int getNumberOfBurgers() {
        return numberOfBurgers;
    }

}
