package ServiceImpl;

import Service.ServiceDisponibiliteHotels;
import Model.example.Chambre;
import Model.example.Hotel;
import Model.example.Offre;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "Service.ServiceDisponibiliteHotels")
public class ServiceDisponibiliteHotelsImpl implements ServiceDisponibiliteHotels {
    private List<Offre> offres;
    private List<Hotel> hotels;


    public ServiceDisponibiliteHotelsImpl(List<Offre> offres, List<Hotel> hotels) {
        this.offres = offres;
        this.hotels = hotels;
    }


    @Override
    public List<Offre> consulterDisponibilites(String HotelNom, String dateArrivee, String dateDepart, int nombrePersonnes) {
        List<Offre> offresDisponibles = new ArrayList<>();

        for (Offre offre : offres) {
            if (offre.isDisponible(dateArrivee, dateDepart, nombrePersonnes)) {
                offresDisponibles.add(offre);
            }
        }

        return offresDisponibles;
    }
    /*
    @Override
    public List<Offre> consulterDisponibilites(String HotelNom, String dateArrivee, String dateDepart, int nombrePersonnes) {
        List<Offre> offresDisponibles = new ArrayList<>();

        for (Offre offre : offres) {
            if (offre.isDisponible(dateArrivee, dateDepart, nombrePersonnes)) {
                offresDisponibles.add(offre);
            }
        }

        return offresDisponibles;
    }
*/


    public Hotel getHotelInfoByName(String hotelName) {
        for (Hotel hotel : hotels) {
            if (hotel.getNom().equals(hotelName)) {
                System.out.println("ok");

                return hotel;
            }
        }
        return null; // Si l'hôtel n'est pas trouvé, renvoyez null ou une valeur par défaut.
    }

}
