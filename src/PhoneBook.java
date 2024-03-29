import java.util.ArrayList;

    public class PhoneBook {
        private ArrayList<Contact> contacts;

        public PhoneBook() {
            this.contacts = new ArrayList<>();
        }

        public boolean addContact(Contact contact) {
            for (Contact existingContact : contacts) {
                if (existingContact.equals(contact)) {
                    return false;
                }
            }
            contacts.add(contact);
            return true;
        }
        public boolean deleteContact(String firstName, String lastName) {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                if (contact.getFirstname().equals(firstName) && contact.getLastname().equals(lastName)) {
                    contacts.remove(i);
                    return true;
                }
            }
            return false;
        }
        public Contact findContact(String firstName, String lastName) {
            for (Contact contact : contacts) {
                if (contact.getFirstname().equals(firstName) && contact.getLastname().equals(lastName)) {
                    return contact;
                }
            }
            return null;
        }
        public Contact[] findContacts(String group) {
            ArrayList<Contact> matchingContacts = new ArrayList<>();
            for (Contact contact : contacts) {
                if (contact.getGroup().equals(group)) {
                    matchingContacts.add(contact);
                }
            }
            if (matchingContacts.isEmpty()) {
                return null;
            } else {
                return matchingContacts.toArray(new Contact[0]);
            }
        }
        public void printContacts() {
            if (contacts.isEmpty()) {
                System.out.println("no contact");
            } else {
                System.out.println("contacts:");
                for (Contact contact : contacts) {
                    System.out.println(contact);
                }
            }
        }

        public ArrayList<Contact> getContacts() {
            return contacts;
        }

        public void setContacts(ArrayList<Contact> contacts) {
            this.contacts = contacts;
        }
    }
