package ServiceImpl;

import Service.HotelReservationService;
import org.example.Chambre;
import org.example.Reservation;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface= "Service.HotelReservationService")
public class HotelReservationServiceImpl implements HotelReservationService {

    private List<Reservation> reservations = new ArrayList<>();


    @Override
    public boolean createReservation(String clientName, String checkInDate, String checkOutDate, int numberOfGuests) {
        return false;
    }

@Override
    public List<Reservation> getReservationsParHotel(String hotelNom) {
        List<Reservation> reservationsParHotel = new ArrayList<>();
        for (Reservation reservation : reservations) {
            for (Chambre chambre : reservation.getChambres()) {
                if (chambre.getHotel().getNom().equals(hotelNom)) {
                    reservationsParHotel.add(reservation);
                    break; // Sortir de la boucle intérieure pour ne pas ajouter la même réservation plusieurs fois
                }
            }
        }
        return reservationsParHotel;
    }
}
