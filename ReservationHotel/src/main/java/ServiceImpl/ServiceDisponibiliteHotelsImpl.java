package ServiceImpl;

import Service.ServiceDisponibiliteHotels;
import org.example.Chambre;
import org.example.Hotel;
import org.example.Offre;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "Service.ServiceDisponibiliteHotels")
public class ServiceDisponibiliteHotelsImpl implements ServiceDisponibiliteHotels {
    private List<Offre> offres;


    public ServiceDisponibiliteHotelsImpl(List<Offre> offres) {
        this.offres = offres;
    }

    @Override
    public List<Offre> consulterDisponibilites(String idAgence, String dateArrivee, String dateDepart, int nombrePersonnes) {
        List<Offre> offresDisponibles = new ArrayList<>();

        for (Offre offre : offres) {
            if (offre.isDisponible(dateArrivee, dateDepart, nombrePersonnes)) {
                offresDisponibles.add(offre);
            }
        }

        return offresDisponibles;
    }


}
