package Exercise2.Products;

public class SpainPhoneNumber implements PhoneNumber {
    private String areaCode;
    private String number;

    public SpainPhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public String getPhoneNumber(){
        return "+" + areaCode + " " + number;
    }

}
