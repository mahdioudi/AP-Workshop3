import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "contacts":
                    if (parts.length < 4) {
                        System.out.println("Invalid command format!");
                        break;
                    }
                    switch (parts[1]) {
                        case "-a":
                            String firstName = parts[2];
                            String lastName = parts[3];
                            System.out.println("please enter contact's group:");
                            String group = scanner.nextLine();
                            System.out.println("please enter contact's email:");
                            String email = scanner.nextLine();
                            System.out.println("please enter contact's country code:");
                            String countryCode = scanner.nextLine();
                            System.out.println("please enter contact's phone number:");
                            String phoneNumber = scanner.nextLine();
                            System.out.println("please enter contact's zipcode:");
                            String zipcode = scanner.nextLine();
                            System.out.println("please enter contact's country:");
                            String country = scanner.nextLine();
                            System.out.println("please enter contact's city:");
                            String city = scanner.nextLine();

                            Contact newContact = new Contact();
                            newContact.setFirstname(firstName);
                            newContact.setLastname(lastName);
                            newContact.setGroup(group);
                            newContact.setEmail(email);
                            PhoneNumber newPhoneNumber = new PhoneNumber();
                            newPhoneNumber.setCountryCode(countryCode);
                            newPhoneNumber.setNumber(phoneNumber);
                            newContact.setPhoneNumber(newPhoneNumber);
                            Address newAddress = new Address();
                            newAddress.setZipcode(zipcode);
                            newAddress.setCountry(country);
                            newAddress.setCity(city);
                            newContact.setAddress(newAddress);

                            boolean added = phoneBook.addContact(newContact);
                            if (added) {
                                System.out.println("contact saved!");
                            } else {
                                System.out.println("contact already exists!");
                            }
                            break;
                        case "-r":
                            if (parts.length != 4) {
                                System.out.println("Invalid command format!");
                                break;
                            }
                            boolean removed = phoneBook.deleteContact(parts[2], parts[3]);
                            if (removed) {
                                System.out.println("Ok");
                            } else {
                                System.out.println("Not found");
                            }
                            break;
                        default:
                            System.out.println("Invalid command format!");
                            break;
                    }
                    break;
                case "show":
                    if (parts.length == 1) {
                        phoneBook.printContacts();
                    } else if (parts.length == 4 && parts[1].equals("-c")) {
                        String firstNameToShow = parts[2];
                        String lastNameToShow = parts[3];
                        Contact contactToShow = phoneBook.findContact(firstNameToShow, lastNameToShow);
                        if (contactToShow == null) {
                            System.out.println("Contact not found");
                        } else {
                            System.out.println("Contact Details:");
                            System.out.println("First Name: " + contactToShow.getFirstname());
                            System.out.println("Last Name: " + contactToShow.getLastname());
                            System.out.println("Group: " + contactToShow.getGroup());
                            System.out.println("Email: " + contactToShow.getEmail());
                            PhoneNumber phoneNumberToShow = contactToShow.getPhoneNumber();
                            System.out.println("Phone Number: (+" + phoneNumberToShow.getCountryCode() + ") " + phoneNumberToShow.getNumber());
                            Address addressToShow = contactToShow.getAddress();
                            System.out.println("Address: " + addressToShow.getZipcode() + " - " + addressToShow.getCountry() + " - " + addressToShow.getCity());
                        }
                    } else if (parts.length == 3 && parts[1].equals("-g")) {
                        String groupNameToShow = parts[2];
                        Contact[] contactsInGroup = phoneBook.findContacts(groupNameToShow);
                        if (contactsInGroup == null || contactsInGroup.length == 0) {
                            System.out.println("No contacts found in this group");
                        } else {
                            System.out.println("Contacts in group " + groupNameToShow + ":");
                            for (Contact contact : contactsInGroup) {
                                System.out.println("First Name: " + contact.getFirstname());
                                System.out.println("Last Name: " + contact.getLastname());
                                System.out.println("Group: " + contact.getGroup());
                                System.out.println("Email: " + contact.getEmail());
                                PhoneNumber phoneNumberToShow = contact.getPhoneNumber();
                                System.out.println("Phone Number: (+" + phoneNumberToShow.getCountryCode() + ") " + phoneNumberToShow.getNumber());
                                Address addressToShow = contact.getAddress();
                                System.out.println("Address: " + addressToShow.getZipcode() + " - " + addressToShow.getCountry() + " - " + addressToShow.getCity());
                                System.out.println();
                            }
                        }
                    } else {
                        System.out.println("Invalid command format!");
                    }
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
        scanner.close();
    }
}
