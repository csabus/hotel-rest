package hu.progmasters.hotelrest.domain;

import hu.progmasters.hotelrest.domain.dto.address.AddressFormCommand;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "city")
    private String city;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "street")
    private String street;

    public Address() {
    }

    public Address(AddressFormCommand address) {
        this.city = address.getCity();
        this.zipCode = address.getCity();
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
