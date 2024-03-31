public class Contact {
    private String group;
    private String email;
    private String firstname;
    private String lastname;


    PhoneNumber phoneNumber = new PhoneNumber();
    Address address = new Address();

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Contact {\n" +
                "  group: " + group + "\n" +
                "  email: " + email + "\n" +
                "  firstName: " + firstname + "\n" +
                "  lastName: " + lastname + "\n" +
                "  phoneNumber: (+" + phoneNumber.getCountryCode() + ") " + phoneNumber.getNumber() + "\n" +
                "  address: " + address.getZipcode() + " - " + address.getCountry() + " - " + address.getCity() + "\n" +
                "}";
    }

}
