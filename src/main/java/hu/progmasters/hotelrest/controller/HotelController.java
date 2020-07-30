package hu.progmasters.hotelrest.controller;

import hu.progmasters.hotelrest.domain.dto.hotel.HotelDetails;
import hu.progmasters.hotelrest.domain.dto.hotel.HotelFormCommand;
import hu.progmasters.hotelrest.domain.dto.hotel.HotelListItem;
import hu.progmasters.hotelrest.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ResponseEntity<List<HotelListItem>> list() {
        List<HotelListItem> hotelListItems = hotelService.findAll();
        return new ResponseEntity<>(hotelListItems, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody HotelFormCommand hotelFormCommand) {
        hotelService.create(hotelFormCommand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelDetails> details(@PathVariable("id") Long id) {
        HotelDetails hotelDetails = hotelService.findDetailsById(id);
        return new ResponseEntity<>(hotelDetails, HttpStatus.OK);

    }
}
