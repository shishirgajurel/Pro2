public class BurgerBarCustomer implements Runnable{
    private int burgerToEat;
    private String name;
    private BurgerBar burgerBar;

    public BurgerBarCustomer(String name, BurgerBar burgerBar, int burgerToEat) {
        this.burgerToEat = burgerToEat;
        this.name = name;
        this.burgerBar = burgerBar;
    }
    public void run() {
        for (int i = 0; i < burgerToEat; i++) {
            try{
                burgerBar.eatBurger(name);
                Thread.sleep(1500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
