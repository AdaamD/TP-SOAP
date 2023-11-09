package Service;

import Model.Offre;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface ReservationChambreAvecAgence {
    /*
    @WebMethod
     String reserverChambreAvecReduction(
            @WebParam(name = "numeroOffre")  int numeroOffre,
            @WebParam(name = "nomClient") String nomClient,
            @WebParam(name = "prenomClient") String prenomClient,
            @WebParam(name = "pourcentageReduction") double pourcentageReduction) ;
*/
     String reserverChambreAvecReduction(
             @WebParam(name = "nomClient") String nomClient,
             @WebParam(name = "prenomClient") String prenomClient,
             @WebParam(name = "prixMin") int prixMin,
             @WebParam(name = "prixMax")int prixMax,
             @WebParam(name = "nbLit")int nbLit,
            @WebParam(name = "pourcentageReduction") double pourcentageReduction);
/*
     Offre rechercherOffre(
             @WebParam(name = "prixMin") int prixMin,
             @WebParam(name = "prixMax")int prixMax,
             @WebParam(name = "nbLit")int nbLit) ;

*/
    }



