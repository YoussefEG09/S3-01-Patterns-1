package Exercise2.Products;

public class SpainPhoneNumber implements PhoneNumber {
    private String code;
    private String number;

    public SpainPhoneNumber(String code, String number) {
        this.code = code;
        this.number = number;
    }

    @Override
    public String getPhoneNumber(){
        return "+" + code + " " + number;
    }

}
