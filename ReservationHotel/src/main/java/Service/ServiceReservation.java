package Service;

import org.example.Reservation;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServiceReservation {
    @WebMethod
    String effectuerReservation(String nomHotel, int idOffre, String nomClient, String prenomClient, String emailClient, int telephoneClient);

    @WebMethod
    Reservation getDetailReservation(String referenceReservation);
}
