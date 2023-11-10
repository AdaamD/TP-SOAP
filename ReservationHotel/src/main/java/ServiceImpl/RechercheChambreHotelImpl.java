package ServiceImpl;

import Service.RechercheChambreHotel;
import Model.Chambre;
import Model.Offre;

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
    public List<Offre> rechercherChambres(float prixMin, float prixMax, int nbLit) {
        List<Offre> offres = new ArrayList<>();

        for (Chambre chambre : chambres) {
            if (chambre.getPrix() >= prixMin && chambre.getPrix() <= prixMax &&
                    chambre.getNbLit() >= nbLit && chambre.isDisponible()) {

                Offre offre = new Offre();
                offre.setIdOffre(chambre.getNumChambre());
                offre.setDateDisponibilite("Date de disponibilité par défaut");
                offre.setDateExpiration("Date d'expiration par défaut");
                offre.setPrix(chambre.getPrix());
                offre.setNombreLits(chambre.getNbLit());

                offres.add(offre);
            }
        }

        return offres;
    }
}
