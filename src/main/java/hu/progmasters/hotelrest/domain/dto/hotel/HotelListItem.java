package hu.progmasters.hotelrest.domain.dto.hotel;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.HotelRating;

public class HotelListItem {
    private Long id;
    private String name;
    private HotelRating start;

    public HotelListItem(Hotel hotel) {
        this.id = hotel.getId();
        this.name = hotel.getName();
        this.start = hotel.getStars();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelRating getStart() {
        return start;
    }

    public void setStart(HotelRating start) {
        this.start = start;
    }
}
