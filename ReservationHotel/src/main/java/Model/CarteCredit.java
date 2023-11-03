package Model;

import java.util.Date;

public class CarteCredit {
    private Integer numero;
    private Date dateExp;
    private  Integer crypto;

    public CarteCredit() {}
    public CarteCredit( Integer numero, Date dateExp, Integer crypto){
        this.numero=numero;
        this.dateExp=dateExp;
        this.crypto=crypto;
    }
}
