package Service;

import Model.example.Hotel;
import Model.example.Offre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService
public interface ServiceDisponibiliteHotels {
    @WebMethod
    List<Offre> consulterDisponibilites(String idAgence, String dateArrivee, String dateDepart, int nombrePersonnes);
    @WebMethod
     Hotel getHotelInfoByName(String hotelName);
}
