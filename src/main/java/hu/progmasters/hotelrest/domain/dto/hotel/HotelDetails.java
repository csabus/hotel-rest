package hu.progmasters.hotelrest.domain.dto.hotel;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.HotelRating;
import hu.progmasters.hotelrest.domain.dto.address.AddressDetails;
import hu.progmasters.hotelrest.domain.dto.room.RoomDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelDetails {
    private Long id;
    private AddressDetails address;
    private String name;
    private HotelRating stars;
    private String description;
    private List<RoomDetails> roomList = new ArrayList<>();


    public HotelDetails() {
    }

    public HotelDetails(Hotel hotel) {
        this.id = hotel.getId();
        this.address = new AddressDetails(hotel.getAddress());
        this.name = hotel.getName();
        this.stars = hotel.getStars();
        this.description = hotel.getDescription();
        this.roomList = hotel.getRoomList()
                .stream()
                .map(RoomDetails::new)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressDetails getAddress() {
        return address;
    }

    public void setAddress(AddressDetails address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelRating getStars() {
        return stars;
    }

    public void setStars(HotelRating stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RoomDetails> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomDetails> roomList) {
        this.roomList = roomList;
    }
}
