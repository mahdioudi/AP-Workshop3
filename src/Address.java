public class Address {
    private String zipcode;
    private String country;
    private String city;


    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String Address(String zipcode , String country , String city){
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;








    }
}
