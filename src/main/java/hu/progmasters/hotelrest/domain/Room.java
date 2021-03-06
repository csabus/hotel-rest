package hu.progmasters.hotelrest.domain;

import com.sun.istack.NotNull;
import hu.progmasters.hotelrest.domain.dto.room.RoomFormCommand;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    @Column(name = "size")
    private RoomSize size;

    @Min(0)
    @Max(10_000)
    @Column(name = "number")
    private Integer number;

    @Column(name = "is_reserver")
    private Boolean isReserved = false;

    @Min(0)
    @Column(name = "price")
    private Double price;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public Room() {
    }

    public Room(Hotel hotel, RoomFormCommand roomFormCommand) {
        this.hotel = hotel;
        this.number = roomFormCommand.getNumber();
        this.price = roomFormCommand.getPrice();
        this.size = roomFormCommand.getSize();
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
