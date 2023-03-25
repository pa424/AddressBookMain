package com.bridgelab.addbokallcases;
import java.lang.String;



    class AddressBook {

        private String firstName;
        private String lastName;
        private long phoneNumber;
        private String address;
        private String city;
        private String state;
        private int pincode;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPincode() {
            return pincode;
        }

        public void setPincode(int pincode) {
            this.pincode = pincode;
        }

        @Override
        public String toString() {
            return "AddressBook{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", pincode=" + pincode +
                    '}';
        }


    }

    public class AddressBookMain {

        public static void main(String[] args) {
            System.out.println("===== WELCOME TO ADDRESS BOOK MANAGEMENT =======");
            Methods display1 = new Methods();
            display1.addcontact();
            display1.print();
            display1.editContact();
            display1.print();
        }
    }
