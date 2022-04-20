package com.Bridgelabz;
import java.util.*;
import java.util.stream.Collectors;


public class AddressBookDictionary {
    HashMap<String, AddressBook> dictionaryOfAddressBooks = new HashMap<>();
    static int count=0;

    //to print the entire address-book dictionary
    public void printAddressBookDictionary(){
        for(Map.Entry<String, AddressBook> e: dictionaryOfAddressBooks.entrySet()){
            System.out.println(e.getKey()+" " +e.getValue());
        }
    }

    // to add multiple address-books to the address-book dictionary
    public void addMultipleAddressBook() {
        System.out.println("How many AddressBooks do you want to create?");
        int numberOfAddressBooks = AddressBook.scanner.nextInt();
        for (int i = 0; i < numberOfAddressBooks; i++) {
            count++;
            dictionaryOfAddressBooks.put("AddressBook" + count, new AddressBook().addMultipleContacts());
        }
    }

        //UC-8 searching a person by state or city across all address-books
        public void searchPersonInCityOrState(String place) {
            for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                e.getValue().addressBook.stream().forEach(n -> {
                    if (n.address.city.equals(place) || n.address.state.equals(place)) {
                        System.out.println("We found " + n.name + " living in " + place);
                    }
                });
            }
        }

            //UC-9 Viewing all persons living in a state or city across all address-books
            public void viewPersonByCityOrState(String place) {
                for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                    e.getValue().addressBook.stream().forEach(n -> {
                        if (n.address.city.equals(place) || n.address.state.equals(place)) {
                            System.out.println("We found " + n + "\n living in " + place);
                        }
                    });
                }
            }


                //UC-10 getting count of persons in a state or city across all address-books
                public void getPersonsCountByCityOrState(String place){
                    long count = 0;
                    for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                        count = e.getValue().addressBook.stream().filter(n -> n.address.city.equals(place) || n.address.state.equals(place)).count();
                        }
                    System.out.println(count + " persons stay in "+place);
                    }

                //UC11- ability to sort individual address-book alphabetically by person names
                public void sortPersonByNames() {
                    for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                        HashSet<Contact> addressBook = e.getValue().addressBook;

                        List<Contact> contacts = addressBook.stream().collect(Collectors.toList());
                        Collections.sort(contacts);
                        System.out.println("\n The Address-Book is sorted by name ");
                        System.out.println(contacts);
                        }
                    }

                    //UC12- ability to sort individual address-book by person city
                    public void sortPersonByCity() {
                        for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                            HashSet<Contact> addressBook = e.getValue().addressBook;

                            List<Contact> contacts = addressBook.stream().collect(Collectors.toList());
                            Collections.sort(contacts);
                            System.out.println("\n The Address-Book is sorted by cities ");
                            System.out.println(contacts);
                        }
                    }

                    //UC12- ability to sort individual address-book by person state
                    public void sortPersonByState() {
                        for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                            HashSet<Contact> addressBook = e.getValue().addressBook;

                            List<Contact> contacts = addressBook.stream().collect(Collectors.toList());
                            Collections.sort(contacts);
                            System.out.println("\n The Address-Book is sorted by states");
                            System.out.println(contacts);
                        }
                    }

                    //UC12- ability to sort individual address-book by person address-zip
                    public void sortPersonByZip(){
                        for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
                            HashSet<Contact> addressBook = e.getValue().addressBook;

                            List<Contact> contacts = addressBook.stream().collect(Collectors.toList());
                            Collections.sort(contacts);
                            System.out.println("\n The Address-Book is sorted by zip ");
                            System.out.println(contacts);
                        }
                    }
}