package hu.progmasters.hotelrest.domain.dto.room;

import hu.progmasters.hotelrest.domain.RoomSize;

public class RoomFormCommand {
    private RoomSize size;
    private Integer number;
    private Double price;
    private Long hotelId;

    public RoomSize getSize() {
        return size;
    }

    public void setSize(RoomSize size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}
