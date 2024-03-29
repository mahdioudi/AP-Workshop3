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


    public Address(String zipcode, String country, String city) {
        this.zipcode = zipcode;
        this.country = country;
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {

        this.zipcode = zipcode;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
