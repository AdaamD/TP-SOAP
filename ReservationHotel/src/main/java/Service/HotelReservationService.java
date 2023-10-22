package Service;

import org.example.Reservation;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HotelReservationService {
    @WebMethod
    boolean createReservation(String clientName, String checkInDate, String checkOutDate, int numberOfGuests);

    @WebMethod
    List<Reservation> getReservationsParHotel(String hotelNom);
}
