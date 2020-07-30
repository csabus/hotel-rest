package hu.progmasters.hotelrest.service;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.dto.HotelListItem;
import hu.progmasters.hotelrest.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HotelService {
    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<HotelListItem> findAll() {
        /*List<Hotel> hotelList = hotelRepository.findAll();
        List<HotelListItem> hotelListItems = new ArrayList<>();
        for (Hotel hotel : hotelList) {
            HotelListItem hotelListItem = new HotelListItem(hotel);
            hotelListItems.add(hotelListItem);
        }
        return hotelListItems;*/

        return hotelRepository.findAll()
                .stream()
                .map(HotelListItem::new)
                .collect(Collectors.toList());
    }
}
