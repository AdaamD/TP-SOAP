package Service;


import Model.Chambre;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface RechercheChambreAgence {
    @WebMethod
    List<Chambre> rechercherChambresAgence(
            @WebParam(name = "prixMin") int prixMin,
            @WebParam(name = "prixMax") int prixMax,
            @WebParam(name = "nbLit") int nbLit
    );
}
