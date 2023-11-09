package ServiceImpl;

import Service.RechercheChambreHotel;
import Model.Chambre;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "Service.RechercheChambreHotel")
public class RechercheChambreHotelImpl implements RechercheChambreHotel {
    private List<Chambre> chambres;

    public RechercheChambreHotelImpl(List<Chambre> chambres) {

        this.chambres = chambres;
    }
    public RechercheChambreHotelImpl() {}


    @Override
    public List<Chambre> rechercherChambres(float prixMin, float prixMax, int nbLit) {
        List<Chambre> chambresDisponibles = new ArrayList<>();

        for (Chambre chambre : chambres) {
            System.out.println("cahmbre"+chambre);
            // correspondance aux critères de recherche
            if (chambre.getPrix() >= prixMin && chambre.getPrix() <= prixMax &&
                    chambre.getNbLit() >= nbLit) {
                chambresDisponibles.add(chambre);
            }
        }

        return chambresDisponibles;
    }

}
