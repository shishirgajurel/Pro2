package dk.via.pro2.restaurant;

import dk.via.pro2.restaurant.consumer.Waiter;
import dk.via.pro2.restaurant.producer.Reception;
import dk.via.pro2.restaurant.shared.Customer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RestaurantMain
{
    public static void main(String[] args) {
        BlockingQueue<Customer> blockingQueue = new ArrayBlockingQueue<Customer>(5);
        Reception producer = new Reception(blockingQueue);
        Waiter consumer = new Waiter(blockingQueue);


        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
