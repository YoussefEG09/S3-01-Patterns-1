package Exercise2.Products;

public class USAddress implements Address{
    private String street;
    private String city;

    public USAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String getAddress(){
        return street + ", " + city + ", Unites States of America";
    }

}

