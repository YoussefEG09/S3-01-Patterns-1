package Exercise2.ConcreteFactories;

import Exercise2.AbstractFactory.ContactFactory;
import Exercise2.Products.Address;
import Exercise2.Products.PhoneNumber;
import Exercise2.Products.SpainAddress;
import Exercise2.Products.SpainPhoneNumber;

public class SpainFactory extends ContactFactory {

    @Override
    public Address createAddress(String street, String city){
        return new SpainAddress(street , city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        String code = "34";
        return new SpainPhoneNumber(code, number);
    }
}


