package Exercise2.Products;

public class SpainAddress implements Address{
    private String street;
    private String city;

    public SpainAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String getAddress(){
        return street + ", " + city + ", Spain";
    }

}
