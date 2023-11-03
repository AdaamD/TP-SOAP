package Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface ReservationChambreAvecAgence {
    @WebMethod
    String reserverChambreAvecReduction(
                @WebParam(name = "nomHotel") String nomHotel,
                @WebParam(name = "numChambre") int numChambre,
                @WebParam(name = "nomClient") String nomClient,
                @WebParam(name = "prenomClient") String prenomClient,
                @WebParam(name = "dateArrive") String dateArrive,
                @WebParam(name = "dateDepart") String dateDepart,
                @WebParam(name = "pourcentageReduction") double pourcentageReduction
        );
}

