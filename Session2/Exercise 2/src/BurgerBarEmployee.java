public class BurgerBarEmployee implements Runnable {
    private String name;
    private BurgerBar burgerBar;
    public BurgerBarEmployee(String name, BurgerBar burgerBar) {
        this.name = name;
        this.burgerBar = burgerBar;
    }
    public void run() {

        while (true) {
            try{
                burgerBar.makeBurger(name);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);

            }
        }
    }
}
