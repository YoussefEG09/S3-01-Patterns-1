package Exercise2.Products;

public class USPhoneNumber implements  PhoneNumber{
    public String code;
    public String number;

    public USPhoneNumber(String code, String number) {
        this.code = code;
        this.number = number;
    }

    @Override
    public String getPhoneNumber(){
        return "+" + code + " " + number;
    }
}
