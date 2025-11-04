package Exercise2;

import Exercise2.Products.Address;
import Exercise2.Products.PhoneNumber;

public class Contact {
    private Address adress;
    private PhoneNumber phoneNumber;


    public Contact(Address address, PhoneNumber phoneNumber) {
        this.adress = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAdress() {
        return adress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Address: " + adress.getAddress() + ", Phone: " + phoneNumber.getPhoneNumber();
    }
}
