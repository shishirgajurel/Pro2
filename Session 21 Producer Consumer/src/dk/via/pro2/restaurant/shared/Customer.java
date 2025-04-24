package dk.via.pro2.restaurant.shared;

import java.security.PublicKey;

public class Customer
{
    private String name;

    public Customer(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "Customer : " + name;
    }
}
