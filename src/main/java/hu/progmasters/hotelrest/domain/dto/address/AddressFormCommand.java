package hu.progmasters.hotelrest.domain.dto.address;

import hu.progmasters.hotelrest.domain.Address;

public class AddressFormCommand {
    private String city;
    private String zipCode;
    private String street;

    public AddressFormCommand() {
    }

    public AddressFormCommand(Address address) {
        this.city = address.getCity();
        this.zipCode = address.getZipCode();
        this.street = address.getStreet();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
