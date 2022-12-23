package oop;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int houseNum;

    public Address(String city, String street, int houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNum == address.houseNum && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, houseNum);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Otradnaya", 18);
        Address address2 = new Address("Moscow", "Otradnaya", 18);

        if (address1.equals(address2)) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not equal!");
        }
    }
}


