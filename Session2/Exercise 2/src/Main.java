//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BurgerBar burgerBar = new BurgerBar(5);

        Thread employee1 = new Thread(new BurgerBarEmployee("Employee 1 ",burgerBar));
        Thread employee2 = new Thread(new BurgerBarEmployee("Employee 2 ",burgerBar));

        Thread customer1 = new Thread(new BurgerBarCustomer("Customer 1", burgerBar,3));
        Thread customer2 = new Thread(new BurgerBarCustomer("Customer 2", burgerBar,3));
        Thread customer3 = new Thread(new BurgerBarCustomer("Customer 3", burgerBar,3));
        Thread customer4 = new Thread(new BurgerBarCustomer("Customer 4", burgerBar,3));
        Thread customer5 = new Thread(new BurgerBarCustomer("Customer 5", burgerBar,3));

        employee1.start();
        employee2.start();
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
        

    }
}