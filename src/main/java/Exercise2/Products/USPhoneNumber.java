package Exercise2.Products;

public class USPhoneNumber implements  PhoneNumber{
    public String areaCode;
    public String number;

    public USPhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public String getPhoneNumber(){
        return "+" + areaCode + " " + number;
    }
}
