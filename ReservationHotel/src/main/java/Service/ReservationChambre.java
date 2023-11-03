package Service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ReservationChambre {
    @WebMethod
    String reserverChambre(
            @WebParam(name = "numChambre") int numChambre,
            @WebParam(name = "nom") String nom,
            @WebParam(name = "prenom") String prenom,
            @WebParam(name = "dateArrive") String dateArrive,
            @WebParam(name = "dateDepart") String dateDepart
    );
}
