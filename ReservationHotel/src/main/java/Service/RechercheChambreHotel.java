package Service;

import Model.Chambre;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface RechercheChambreHotel {
    @WebMethod
    List<Chambre> rechercherChambres(
            @WebParam(name = "prixMinimum") float prixMinimum,
            @WebParam(name = "prixMaximum") float prixMaximum,
            @WebParam(name = "nbLit")int nbLit);
}
