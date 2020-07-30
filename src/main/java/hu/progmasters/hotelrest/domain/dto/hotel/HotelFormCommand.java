package hu.progmasters.hotelrest.domain.dto.hotel;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.HotelRating;
import hu.progmasters.hotelrest.domain.dto.address.AddressFormCommand;

public class HotelFormCommand {

    private String name;
    private String description;
    private AddressFormCommand address;
    private HotelRating stars;

    public HotelFormCommand() {
    }

    public HotelFormCommand(Hotel hotel) {
        this.name = hotel.getName();
        this.description = hotel.getDescription();
        this.address = new AddressFormCommand(hotel.getAddress());
        this.stars = hotel.getStars();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressFormCommand getAddress() {
        return address;
    }

    public void setAddress(AddressFormCommand address) {
        this.address = address;
    }

    public HotelRating getStars() {
        return stars;
    }

    public void setStars(HotelRating stars) {
        this.stars = stars;
    }
}
