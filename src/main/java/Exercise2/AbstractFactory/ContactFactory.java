package Exercise2.AbstractFactory;

import Exercise2.Products.Address;
import Exercise2.Products.PhoneNumber;

public abstract class ContactFactory {
    public abstract Address createAddress(String street, String city);

    public abstract PhoneNumber createPhoneNumber(String code, String number);
}
