package ServiceImpl;

import Service.RechercheChambreAgence;
import Model.Chambre;
import Model.Hotel;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.ArrayList;

// Importez la classe Offre
import Model.Offre;

@WebService(endpointInterface = "Service.RechercheChambreAgence")
public class RechercheChambreAgenceImpl implements RechercheChambreAgence {
    private List<Hotel> listeHotels;

    public RechercheChambreAgenceImpl(List<Hotel> listeHotels) {
        this.listeHotels = listeHotels;
    }

    public RechercheChambreAgenceImpl() { }

    @Override
    public List<Offre> rechercherChambresAgence(int prixMin, int prixMax, int nbLit) {
        List<Offre> offres = new ArrayList<>();

        for (Hotel hotel : listeHotels) {
            System.out.println(hotel);
            // Appel au service web de recherche de chambres de l'hôtel
            RechercheChambreHotelImpl serviceHotel = new RechercheChambreHotelImpl(hotel.getChambres());

            List<Chambre> chambresHotel = serviceHotel.rechercherChambres(prixMin, prixMax, nbLit);

            // Créez des offres à partir des chambres de l'hôtel
            for (Chambre chambre : chambresHotel) {
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
