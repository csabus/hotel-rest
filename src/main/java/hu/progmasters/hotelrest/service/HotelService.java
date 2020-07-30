package hu.progmasters.hotelrest.service;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.dto.hotel.HotelDetails;
import hu.progmasters.hotelrest.domain.dto.hotel.HotelFormCommand;
import hu.progmasters.hotelrest.domain.dto.hotel.HotelListItem;
import hu.progmasters.hotelrest.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
@Transactional
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

    public void create(HotelFormCommand hotelFormCommand) {
        Hotel hotel = new Hotel(hotelFormCommand);
        hotelRepository.save(hotel);
    }

    public Hotel findById(Long hotelId) {
        return hotelRepository.findById(hotelId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find hotel with id: " + hotelId));
    }

    public HotelDetails findDetailsById(Long id) {
        Hotel hotel = findById(id);
        return new HotelDetails(hotel);
    }
}
