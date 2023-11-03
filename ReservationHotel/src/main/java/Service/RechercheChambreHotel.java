package Service;

import Model.Chambre;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RechercheChambreHotel {
    @WebMethod
    List<Chambre> rechercherChambres(float prixMinimum, float prixMaximum, int nbLit);
}
