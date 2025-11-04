package Exercise2.ConcreteFactories;

import Exercise2.AbstractFactory.ContactFactory;
import Exercise2.Products.Address;
import Exercise2.Products.PhoneNumber;
import Exercise2.Products.USAddress;
import Exercise2.Products.USPhoneNumber;

public class USFactory extends ContactFactory {

    @Override
    public Address createAddress(String street, String city) {
        return new USAddress(street, city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String code, String number) {
        return new USPhoneNumber(code, number);
    }
}
