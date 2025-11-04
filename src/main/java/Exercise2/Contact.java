package Exercise2;

import Exercise2.Products.Address;
import Exercise2.Products.PhoneNumber;

public class Contact {
    private String name;
    private Address adress;
    private PhoneNumber phoneNumber;


    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        this.name = name;
        this.adress = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public Address getAdress() {
        return adress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Address: " + adress.getAddress() + ", Phone: " + phoneNumber.getPhoneNumber();
    }
}
