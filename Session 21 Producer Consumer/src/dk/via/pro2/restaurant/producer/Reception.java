package dk.via.pro2.restaurant.producer;
import dk.via.pro2.restaurant.shared.Customer;
import java.util.concurrent.BlockingQueue;
public class Reception implements Runnable
    {
    BlockingQueue<Customer> blockingQueue;
    public Reception(BlockingQueue<Customer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        String [] customerNames = { "Mihail", "Nancy", "Mario", "Youssef", "Alessia", "Jan","Willem", "Viacheslav", "Wiktoria","Alisa","Li"};
        System.out.println(customerNames.length + " Customers waiting ......");
        for (String  c : customerNames) {
            Customer customer = new Customer(c);
            try{
                Thread.sleep(1000);
                blockingQueue.put(customer);
                System.out.println("Put " + customer + " into queue");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //No more customer, receptionist can join now
        System.out.println("No more customers to put in the queue");
        try{
            Thread.sleep(200);
            blockingQueue.put(new Customer("Receptionist"));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
