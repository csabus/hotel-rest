package hu.progmasters.hotelrest.domain.dto.room;

import hu.progmasters.hotelrest.domain.Room;
import hu.progmasters.hotelrest.domain.RoomSize;

public class RoomDetails {
    private Long id;
    private RoomSize size;
    private Integer number;
    private Boolean isReserved = false;
    private Double price;

    public RoomDetails() {
    }

    public RoomDetails(Room room) {
        this.id = room.getId();
        this.size = room.getSize();
        this.number = room.getNumber();
        this.isReserved = room.getReserved();
        this.price = room.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
