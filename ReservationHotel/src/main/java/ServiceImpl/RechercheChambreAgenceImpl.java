package ServiceImpl;

import Service.RechercheChambreAgence;
import Model.Chambre;
import Model.Hotel;
import Model.Offre;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

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
            RechercheChambreHotelImpl serviceHotel = new RechercheChambreHotelImpl(hotel.getChambres());

            List<Offre> offresHotel = serviceHotel.rechercherChambres(prixMin, prixMax, nbLit);

            offres.addAll(offresHotel);
        }

        return offres;
    }
}
