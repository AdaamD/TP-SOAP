    package ServiceImpl;


    import Service.RechercheChambreAgence;
    import Model.Chambre;
    import Model.Hotel;

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
        public List<Chambre> rechercherChambresAgence( int prixMin, int prixMax, int nbLit) {
            List<Chambre> chambresDisponibles = new ArrayList<>();

            for (Hotel hotel : listeHotels) {
                for (Chambre chambre : hotel.getChambres()) {
                    System.out.println("Hotel " +hotel);
                    if (chambre.getPrix() >= prixMin && chambre.getPrix() <= prixMax && chambre.getNbLit() >= nbLit) {
                        chambresDisponibles.add(chambre);
                    }
                }
            }

            return chambresDisponibles;
        }
    }
