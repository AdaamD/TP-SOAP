package Utilisation;

import java.net.URL;
import java.util.List;

import Consomation.Hotel;
import Consomation.Offre;

import Consomation.ServiceDisponibiliteHotelsImplService;
import Consomation.ServiceDisponibiliteHotels;


public class MyClient {
    public static void main(String[] args) {
        try {
            // Créez une instance de l'URL du service web à consommer
            URL url = new URL("http://localhost:8080/service-disponibilite?wsdl");

            // Récupérez une instance de l'implémentation du service web
            ServiceDisponibiliteHotelsImplService service = new ServiceDisponibiliteHotelsImplService(url);

            // Récupérez un proxy du service web
            ServiceDisponibiliteHotels proxy = service.getServiceDisponibiliteHotelsImplPort();

            // Appelez la méthode "consulterDisponibilites" pour obtenir les disponibilités d'un hôtel spécifique
            String hotelRecherche = "hotel1"; // Remplacez "Hotel1" par le nom de l'hôtel que vous recherchez
            List<Offre> offresDisponibles = proxy.consulterDisponibilites(hotelRecherche, "2023-11-01", "2023-11-10", 2);



            // Appelez la méthode "consulterDisponibilites" pour obtenir les disponibilités d'un hôtel
           // List<Offre> offresDisponibles = proxy.consulterDisponibilites("Hotel1", "2023-11-02", "2023-11-10", 2);

            // Affichez ou traitez les offres disponibles
            for (Offre offre : offresDisponibles) {
                System.out.println("Type de chambre : " + offre.getTypeChambre());
                System.out.println("Date de disponibilité : " + offre.getDateDisponibilite());
                System.out.println("Prix : " + offre.getPrix() + " €");
                System.out.println();
            }




            // Traitez les réponses du service web si nécessaire
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
